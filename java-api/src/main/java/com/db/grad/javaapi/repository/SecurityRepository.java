package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    
}
