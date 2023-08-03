package com.db.grad.javaapi;

import com.db.grad.javaapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.grad.javaapi.repository.BooksRepository;

import java.util.List;

@SpringBootApplication
public class JavaApiApplication implements CommandLineRunner {
	@Autowired
	BooksRepository booksRepository;

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");

		List<Book> books = booksRepository.findAll();
		for(Book book : books) {
			System.out.println(book);
		}

		// List<Book> books = booksRepository.findBookNameStartingWithLetter("T%");
		// for(Book book : books) {
		// 	System.out.println(book);
		// }
	}

}
