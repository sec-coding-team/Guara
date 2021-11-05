package com.second.guara;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.second.guara.mapper")
public class GuaraApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuaraApplication.class, args);
    }

}
