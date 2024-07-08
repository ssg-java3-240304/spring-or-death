package spring.app.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegistDto {
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public MemberDto toMemberDto() {
        return new MemberDto(0, this.memberEmail, this.memberPassword, this.memberName, LocalDateTime.now());
    }
}
