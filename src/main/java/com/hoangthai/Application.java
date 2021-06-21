package com.hoangthai;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })//theem thang nay để bỏ qua bước authen khi xài spring security
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
