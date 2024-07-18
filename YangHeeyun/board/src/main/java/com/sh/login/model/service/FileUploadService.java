package com.sh.login.model.service;

import com.sh.login.model.dto.FileDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service@Slf4j
public class FileUploadService {
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
    public FileDto upload(MultipartFile multipartFile) throws IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(username, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            try(InputStream inputStream = multipartFile.getInputStream()){
                String contentType = multipartFile.getContentType(); // 업로드된 파일의 MIME 타입(image/png 등) 저장
                String originalFilename = multipartFile.getOriginalFilename(); // 원복파일 이름 변수에 저장
//                String dir = "/test"; // 파일 업로드할 디렉토리 지정
                String renamedFilename = getRenamedFilename(originalFilename);

                // FTP서버에 실제 파일 업로드(전송)
                boolean done = ftpClient.storeFile(renamedFilename, inputStream);
                if (!done)
                    throw new RuntimeException("[" + multipartFile + "] 파일 업로드에 실패했습니다.");

                // 파일 URL 생성
                String url = "http://ssg-java3.iptime.org/myftp/";

                // Builder패턴을 사용한 객체 생성
                // 파일 업로드 성공시, 업로드된 파일 정보를 반환하는 FileDto 객체 생성
                return FileDto.builder()
                        .originalFilename(originalFilename)
                        .renamedFilename(renamedFilename)
                        .contentType(contentType)
                        .profilePath( url + renamedFilename) // path를 FileDto에 저장
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

    private String getRenamedFilename(String originalFileName) {
        String ext = originalFileName.substring(originalFileName.lastIndexOf(".")); // .png
        return  UUID.randomUUID() + ext ;
    }
}