package com.sh._01_loginform.login.service;

import com.sh._01_loginform.login.dao.LoginMapper;
import com.sh._01_loginform.login.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor@Data@Slf4j@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED,
        rollbackFor = Exception.class
)
public class LoginService {
    private final LoginMapper loginMapper;

    public Boolean duplicateId(String id) {
        Optional<MemberDto> optionalLoginDto = loginMapper.duplicateId(id);
        Boolean b = optionalLoginDto.isPresent();
        log.debug(id);
        log.debug("{}",b);
        return b;
    }

    @Transactional
    public int registerMember(String memberEmail, String memberPassword,String memberName) {
        return loginMapper.registerMember(memberEmail,memberPassword,memberName);
    }
}
