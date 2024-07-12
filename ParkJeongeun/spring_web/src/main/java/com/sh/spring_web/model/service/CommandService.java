package com.sh.spring_web.model.service;

import com.sh.spring_web.model.dao.MemberMapper;
import com.sh.spring_web.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class CommandService {
    @Value("${ftp.server.host}")
    private String server;
    @Value("${ftp.server.port}")
    private int port;
    @Value("${ftp.server.username}")
    private String username;
    @Value("${ftp.server.password}")
    private String password;

    private final MemberMapper memberMapper;

    public int insertMember(MultipartFile profile, MemberDto memberDto) throws IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(username, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            try (InputStream inputStream = profile.getInputStream()){
                String contentType = profile.getContentType();
                String originalFileName = profile.getOriginalFilename();
                String renamedFileName = getRenamedFileName(originalFileName);

                boolean done = ftpClient.storeFile(renamedFileName, inputStream);
                if (done){
                    memberDto.setProfile(renamedFileName);
                    return memberMapper.insertMember(memberDto);
                } else {
                    throw new RuntimeException(profile + "파일 업로드에 실패했습니다.");
                }
            }
        } finally {
            try {
                if (ftpClient.isConnected()){
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private String getRenamedFileName(String originalFileName) {
        String ext = originalFileName.substring(originalFileName.lastIndexOf("."));
        return "%s%s".formatted(UUID.randomUUID().toString(), ext);
    }
}