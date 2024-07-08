package com.sh.parktaejun.user.model.service;

import com.sh.parktaejun.user.model.dao.UserMapper;
import com.sh.parktaejun.user.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    public int registUserInfo(UserDto userDto) {
        return userMapper.registUserInfo(userDto);
    }
}
