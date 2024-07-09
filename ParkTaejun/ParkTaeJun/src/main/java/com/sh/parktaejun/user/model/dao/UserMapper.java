package com.sh.parktaejun.user.model.dao;

import com.sh.parktaejun.user.model.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    int registUserInfo(UserDto userDto);

    UserDto checkDuplicate(String email);

    Optional<UserDto> findAllUserByEmail(String email);
}
