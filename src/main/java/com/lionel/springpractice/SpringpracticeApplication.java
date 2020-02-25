package com.lionel.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main app class with main method serving as my entrypoint
// note the annotation telling spring boot this is the entry point
@SpringBootApplication
public class SpringpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeApplication.class, args);
	}

}
