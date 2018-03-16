package com.example.comspringweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//tu mam działąjący spring web ;)
@SpringBootApplication
public class ComSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComSpringWebApplication.class, args);

		System.out.println("Spring is working");
	}
}
