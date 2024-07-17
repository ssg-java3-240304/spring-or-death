package com.sh._01_loginform.login.dao;

import com.sh._01_loginform.login.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface LoginMapper {

    Optional<MemberDto> duplicateId(String id);

    int registerMember(String memberEmail, String memberPassword,String memberName,String path);


}
