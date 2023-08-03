package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, String>{
   @Query(nativeQuery = true, value = "select * from book where book_name = :book_name")
   List<Book> findByBookName(Book book_name);
}
