package com.tka.myfirstSB_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class MyfirstSbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstSbProjectApplication.class, args);
		System.out.println("Application started");
	}

}
