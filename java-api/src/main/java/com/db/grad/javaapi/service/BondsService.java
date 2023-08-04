package com.db.grad.javaapi.service;

import java.util.*;
import java.time.*;
import com.db.grad.javaapi.model.Trades;
import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Service;
import org.springframework.boot.CommandLineRunner;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BondsService implements CommandLineRunner{
    @Autowired
    SecurityRepository securityRepository;
    
    @Autowired
    private TradeRepository tradeRepository;
       
    public List<Security> getAllBonds(){
        return securityRepository.findAll();
    }

    // public Security getBond(){
    //     List<Security> bonds = securityRepository.findAll();
    //     return bonds.get(2);
    // }

    public List<Security> getBondsDueForMaturity(String maturityDate) {
        return securityRepository.findBondsByMaturityDate(maturityDate);
    }

    public List<Security> bondsToMature(){ //look at next 5 days
        List<Security> bonds = securityRepository.findAll();
        List<Security> qualifying = new ArrayList<Security>();
        LocalDate today = LocalDate.now(); //today's date
        for (Security bond : bonds) {
            if (LocalDate.parse(bond.getMaturityDate()).isAfter(today) && LocalDate.parse(bond.getMaturityDate()).isBefore(today.plusDays(5))) {
                qualifying.add(bond);
            }
        }
        return qualifying;
    }

    public List<Security> bondsMatured(){ //look at last 5 days
        List<Security> bonds = securityRepository.findAll();
        List<Security> qualifying = new ArrayList<Security>();
        LocalDate today = LocalDate.now(); //today's date
        for (Security bond : bonds) {
            if (LocalDate.parse(bond.getMaturityDate()).isAfter(today.minusDays(5)) && LocalDate.parse(bond.getMaturityDate()).isBefore(today)) {
                qualifying.add(bond);
            }
        }
        return qualifying;
    }    

    public List<Trades> bondsToBeSettled(){ //compare settlement date to today's date
        List<Trades> trades = tradeRepository.findAll();
        List<Trades> qualifying = new ArrayList<Trades>();
        LocalDate today = LocalDate.now(); //today's date
        for (Trades trade : trades) {
            if (LocalDate.parse(trade.getSettlementDate()).isAfter(today)) {
                qualifying.add(trade);
            }
        }
        return qualifying;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("checkpoint");
        System.out.println(LocalDate.parse("2023-08-03"));
    }
}


// LocalDate date = LocalDate.now(); //today's date
        // if(LocalDate.parse("2023-08-03").isBefore(date.plusDays(5)) || LocalDate.parse("2023-08-03").isAfter(date.minusDays(5))){
        //     System.out.println("checkpoint");
        // }
        // else System.out.println("not qualifying"); 
        // System.out.println(qualifyingBonds("2023-08-03"));

// //given a date, show bonds that will mature in 5 days or have matured in the last 5 days
//     public List<Security> qualifyingBonds(String maturityDate){
//         List<Security> bonds = securityRepository.findAll();
//         List<Security> qualifying = new ArrayList<Security>();
//         LocalDate date = LocalDate.now(); //today's date
//         for (Security bond : bonds) {
//             // System.out.println("before replace: " + bond.getMaturityDate());
//             // bond.getMaturityDate().replaceAll("\'","");
//             // System.out.println("after replace: " + bond.getMaturityDate());
//             // if (LocalDate.parse(bond.getMaturityDate()).isBefore(date.plusDays(5)) || LocalDate.parse(bond.getMaturityDate()).isAfter(date.minusDays(5))) {
//             //     qualifying.add(bond);
//             // }

//             // Given String
//             String dateString = bond.getMaturityDate();
//             // Specify date format using DateTimeFormatter
//             DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//             // Convert String to LocalDateTime Object using overloaded static parse() method
//             LocalDate localdate = LocalDate.parse(dateString, dateTimeFormatter);
//             // Printing LocalDateTime object
//             System.out.println("Converted String to LocalDateTime: " + localdate);
//         }
//         return qualifying;
//     }