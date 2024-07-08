package com.sh.parktaejun.user.model.dao;

import com.sh.parktaejun.user.model.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int registUserInfo(UserDto userDto);
}
