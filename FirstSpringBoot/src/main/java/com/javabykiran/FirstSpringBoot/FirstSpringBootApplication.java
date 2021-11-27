package com.javabykiran.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan(basePackages={"com.javabykiran"})
@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		
		System.out.println("Hello");
	}

}
