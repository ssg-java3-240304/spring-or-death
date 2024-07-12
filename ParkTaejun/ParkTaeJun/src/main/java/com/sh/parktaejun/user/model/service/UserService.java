package com.sh.parktaejun.user.model.service;

import com.sh.parktaejun.user.model.dao.UserMapper;
import com.sh.parktaejun.user.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public int registUserInfo(UserDto userDto) {
        return userMapper.registUserInfo(userDto);
    }

    public String checkDuplicate(String email) {
      Optional<UserDto> userByEmail =  userMapper.findAllUserByEmail(email);
        if (userByEmail.isPresent()){
            return "no";
        }else {
            return "ok";
        }
    }


}
