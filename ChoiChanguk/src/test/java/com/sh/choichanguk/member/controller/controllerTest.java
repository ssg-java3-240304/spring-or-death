package com.sh.choichanguk.member.controller;

import com.sh.choichanguk.member.model.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class controllerTest {
    @Autowired
    private Service service;


//    @Test
//    void email()
//    {
//        int email=Integer.parseInt(service.findByEmail("hong@example.com"));
//        System.out.println("email = " + email);
//    }

}