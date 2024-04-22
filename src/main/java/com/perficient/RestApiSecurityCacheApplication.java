package com.perficient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class RestApiSecurityCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiSecurityCacheApplication.class, args);
    }

}
