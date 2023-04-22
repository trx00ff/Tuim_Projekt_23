package com.krlyn.tuim23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan({"com.krlyn.tuim23.controller"})
public class Tuim23Application {

	public static void main(String[] args) {
		SpringApplication.run(Tuim23Application.class, args);
	}

}
