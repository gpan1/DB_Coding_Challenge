package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Long> {
    //view bonds due for maturity within the last and next 5 days
    // @Query(value = "SELECT * FROM security WHERE maturity_date BETWEEN DATE_SUB(CURDATE(), INTERVAL 5 DAY) AND DATE_ADD(CURDATE(), INTERVAL 5 DAY)", nativeQuery = true)
    // @Query(value = "SELECT * FROM security WHERE maturity_date BETWEEN TIMESTAMPADD(DAY, -5, CURDATE()) AND TIMESTAMPADD(DAY, 5, CURDATE())", nativeQuery = true)
    // List<Security> findBondsByMaturityDateIn5Days();
   
    List<Security> findBondsByMaturityDate(String maturityDate); 

    /**
     * // B.P 
    public List<Security> getBondsByDateRange();
     */
}
