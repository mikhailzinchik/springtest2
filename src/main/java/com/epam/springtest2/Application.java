package com.epam.springtest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by student on 28.01.2019.
 */
@SpringBootApplication
@ComponentScan(value = "com.epam.springtest2")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
