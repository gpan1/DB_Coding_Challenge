package com.db.grad.javaapi;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.grad.javaapi.repository.BooksRepository;

import java.util.List;

@SpringBootApplication
public class JavaApiApplication implements CommandLineRunner {
	// @Autowired
	// BooksRepository booksRepository;

	// @Autowired
	// SecurityRepository securityRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");

		// List<Book> books = booksRepository.findAll();
		// for(Book book : books) {
		// 	System.out.println(book);
		// }

		// List<Security> securities = securityRepository.findAll();
		// for(Security security : securities) {
		// 	System.out.println(security);
		// }

		// List<Book> books = booksRepository.findBookNameStartingWithLetter("T%");
		// for(Book book : books) {
		// 	System.out.println(book);
		// }
	}

}
