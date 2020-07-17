package com.lee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com.lee.*"})
public class AlumniSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlumniSystemApplication.class, args);
    }
}
