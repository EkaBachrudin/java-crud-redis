package com.danafix.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.time.Duration;
@SpringBootApplication
@EnableCaching
public class DanafixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanafixApplication.class, args);
	}

}
