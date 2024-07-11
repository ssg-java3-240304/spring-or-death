package spring.app.file.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDto {
    private long id;
    private String contentType;
    private String originalFilename;
    private String renamedFilename;
}
