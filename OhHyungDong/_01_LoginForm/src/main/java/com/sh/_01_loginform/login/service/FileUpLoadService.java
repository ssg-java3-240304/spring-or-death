package com.sh._01_loginform.login.service;

import com.sh._01_loginform.login.dto.FileDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.codehaus.groovy.tools.shell.IO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service@Slf4j
public class FileUpLoadService {
    @Value("${ftp.server.host}")
    private String server;

    @Value("${ftp.server.port}")
    private int port;

    @Value("${ftp.server.username}")
    private String username;

    @Value("${ftp.server.password}")
    private String password;

    /**
     * 파일 전송 방식
     * 1. FTP에 대한 정보 입력 -> InputStream을 통해 입력 받은 파일을 받아오고 , originalFileName을 통해서 -> 암호화작업 진행
     * 2. 이미지를 저장할 주소 저장
     * 3. FTP로 데이터 전송 -> (주소값, 암호화한 파일명 , inputStream) : 여기서 inputStream은 파일에 대한 정보
     */
    public FileDto upLoad(MultipartFile image) throws IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(username, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            try(InputStream inputStream = image.getInputStream()){
                String originalFileName  = image.getOriginalFilename();
                String saveFileName = getImageName(originalFileName);
                //파일을 저장할 디렉토리 입력 -> myftp 디렉토리 안에다가 saveFileName으로
                String dir = "myftp/";
                // 파일 전송
                boolean done = ftpClient.storeFile(dir + saveFileName, inputStream);
                log.debug("파일 전송 여부 : {}",done);
//                if(!done) throw new RuntimeException("파일 전송 실패 "); < 이부분은 전송이 실패하면 주석해제

                return FileDto.builder()
                        .originalFilename(originalFileName)
                        .savedFilename(saveFileName)
                        .path(dir + saveFileName) //path를 데이터베이스에 저장해야되기 때문에 path값도 출력
                        .build();
            }
        }finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private String getImageName(String originalFileName) {
        String ext = originalFileName.substring(originalFileName.lastIndexOf(".")); // .png
         return  UUID.randomUUID() + ext ;
    }


}