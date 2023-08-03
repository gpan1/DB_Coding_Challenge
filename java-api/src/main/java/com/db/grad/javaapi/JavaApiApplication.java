package com.db.grad.javaapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.grad.javaapi.repository.BooksRepository;

@SpringBootApplication
public class JavaApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running...Running...Woo!");
	}

	

}
