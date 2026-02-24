package com.smartpichub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.smartpichub.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class SmartPicHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartPicHubApplication.class, args);
        System.out.println("backend is running");
    }

}
