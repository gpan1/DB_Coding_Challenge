package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Books;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, String> {
    //find book starting with a letter
    @Query(nativeQuery = true, value = "select * from book where name like :letter")
    List<Books> findBookNameStartingWithLetter(String letter);
}
