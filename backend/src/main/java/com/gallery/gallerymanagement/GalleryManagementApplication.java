package com.gallery.gallerymanagement;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.gallery.gallerymanagement.Mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class GalleryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(GalleryManagementApplication.class, args);
        System.out.println("backend is running");
    }

}
