package com.kuaiyu.ai.speech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
@MapperScan
public class SpeechApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeechApplication.class, args);
    }

}
