package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.BookUser;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookUserRepository extends JpaRepository<BookUser, String> {
}
