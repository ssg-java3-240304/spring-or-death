package com.sh._01_loginform.login.dao;

import com.sh._01_loginform.login.dto.MemberDto;

import java.util.Optional;

public interface LoginMapper {

    Optional<MemberDto> duplicateId(String id);

    int registerMember(String memberEmail, String memberPassword,String memberName,String path);


}
