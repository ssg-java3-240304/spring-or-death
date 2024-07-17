package spring.app.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String profileUrl;
}
