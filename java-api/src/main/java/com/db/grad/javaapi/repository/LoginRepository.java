package com.db.grad.javaapi.repository;


import com.db.grad.javaapi.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, String> {
}
