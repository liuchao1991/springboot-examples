package com.liuchao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleApplication {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
