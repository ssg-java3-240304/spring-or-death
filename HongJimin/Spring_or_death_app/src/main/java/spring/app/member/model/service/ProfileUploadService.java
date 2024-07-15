package spring.app.member.model.service;


import org.springframework.beans.factory.annotation.Value;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class ProfileUploadService {

    @Value("${ftp.server.host}")
    private String server;

    @Value("${ftp.server.port}")
    private int port;

    @Value("${ftp.server.username}")
    private String username;

    @Value("${ftp.server.password}")
    private String password;

    public String profileUpload(MultipartFile multipartFile) throws IOException {
        FTPClient ftpClient = new FTPClient();
        try {
            // 이진 데이터 받기
            ftpClient.connect(server, port);
            ftpClient.login(username, password);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);

            // 실제 데이터가 입출력 stream으로 왔다갔다 함!
            try (InputStream inputStream = multipartFile.getInputStream()) {
                String contentType = multipartFile.getContentType();
                String originalFilename = multipartFile.getOriginalFilename();
                String dir = "profile/";
                String renamedFileName = getRenamedFileName(originalFilename);
                String url = "http://ssg-java3.iptime.org/myftp/" + getRenamedFileName(originalFilename);

                // 실제 파일 전송
                boolean profileUpload = ftpClient.storeFile(renamedFileName, inputStream);
                if (!profileUpload) {
                    throw new RuntimeException("[" + multipartFile + "] 파일 업로드에 실패했습니다.");
                }
                return url;
            }
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getRenamedFileName(String originalFileName) {
        return "%s_%s".formatted(UUID.randomUUID().toString(), originalFileName);
    }
}
