package com.wl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.wl.mapper")
@SpringBootApplication
public class WuliuYslhApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuliuYslhApplication.class, args);
    }

}
