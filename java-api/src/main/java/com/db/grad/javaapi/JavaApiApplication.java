package com.db.grad.javaapi;

import java.util.List;
// import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.Security;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.db.grad.javaapi.repository.BooksRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
// public class JavaApiApplication implements CommandLineRunner {
public class JavaApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
	}
}























	// @Autowired
	// BooksRepository booksRepository;

	// @Autowired
	// SecurityRepository securityRepository;

	// @Override
	// public void run(String... args) throws Exception {
	// 	System.out.println("Running...");

	// 	// List<Book> books = booksRepository.findAll();
	// 	// for(Book book : books) {
	// 	// 	System.out.println(book);
	// 	// }

	// 	// List<Security> securities = securityRepository.findAll();
	// 	// for(Security security : securities) {
	// 	// 	System.out.println(security);
	// 	// 	System.out.println(security.getMaturityDate());
	// 	// }

	// 	// List<Book> books = booksRepository.findBookNameStartingWithLetter("T%");
	// 	// for(Book book : books) {
	// 	// 	System.out.println(book);
	// 	// }
	// }

// }
