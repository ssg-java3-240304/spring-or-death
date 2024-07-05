package com.sh.choichanguk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan
@SpringBootApplication
public class ChoiChangukApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChoiChangukApplication.class, args);
    }

}
