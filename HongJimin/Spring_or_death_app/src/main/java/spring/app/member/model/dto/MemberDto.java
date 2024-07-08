package spring.app.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private int memberId;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private LocalDateTime registrationDate;


}
