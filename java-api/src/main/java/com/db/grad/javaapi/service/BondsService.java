package com.db.grad.javaapi.service;

import java.util.*;
import java.time.*;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trade;
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

    public Security getBondById(int id){
        List<Security> bonds = securityRepository.findAll();
        for (Security bond : bonds) {
            if (bond.getId() == id) {
                return bond;
            }
        }
        return null;
    }

    public String getBond(){
        List<Security> bonds = securityRepository.findAll();
        return bonds.get(2).getCusip();
    }

    public List<Security> bondsToBeMature(){ //look at next 5 days
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
    
    // public Pair<List<Security>, List<Security>> bondsMaturedAndMaturing(){  //mature and maturing bonds
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Security> matured = new ArrayList<Security>();
    //     List<Security> maturing = new ArrayList<Security>();
    //     LocalDate today = LocalDate.now(); //today's date
    //     for (Security bond : bonds) {
    //         if (LocalDate.parse(bond.getMaturityDate()).isAfter(today) && LocalDate.parse(bond.getMaturityDate()).isBefore(today.plusDays(5))) {
    //             maturing.add(bond);
    //         }
    //         else if (LocalDate.parse(bond.getMaturityDate()).isAfter(today.minusDays(5)) && LocalDate.parse(bond.getMaturityDate()).isBefore(today)) {
    //             matured.add(bond);
    //         }
    //         else continue;
    //     }
    //     return new Pair<List<Security>, List<Security>>(matured, maturing);
    // }

    public List<Trade> bondsToBeSettled(){ //compare settlement date to today's date
        List<Trade> trades = tradeRepository.findAll();
        List<Trade> qualifying = new ArrayList<Trade>();
        LocalDate today = LocalDate.now(); //today's date
        for (Trade trade : trades) {
            if (LocalDate.parse(trade.getSettlementDate()).isAfter(today)) {
                qualifying.add(trade);
            }
        }
        return qualifying;
    }
    
    public String bondsISINandCUSIP(int id){ //view a Bond’s ISIN and CUSIP code
        List<Security> bonds = securityRepository.findAll();
        Pair<String, String> isinAndCusip = new Pair<String, String>(bonds.get(id).getIsin(), bonds.get(id).getCusip());
        return "ISIN Code: " + isinAndCusip.getValue0() + "\n" + "CUSIP Code: " + isinAndCusip.getValue1();
    }

    // show where almost mature bonds have been actioned by others (to prevent duplication of effort and allow oversight)

    // as a user I want to be able to see bonds in books I am responsible for
        //user_id takes me to book_user which gives me book_id. go into books and print corresponding bonds for that book_id
    // public List<Security> bondsInBooks(int user_id){
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Security> qualifying = new ArrayList<Security>();
    //     for (Security bond : bonds) {
    //         if (bond.getBookId() == user_id) {
    //             qualifying.add(bond);
    //         }
    //     }
    //     return qualifying;
    // }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Testing");
        System.out.println(LocalDate.parse("2023-08-03"));
        System.out.println(bondsISINandCUSIP(0));
        // System.out.println(bondsMaturedAndMaturing());
        System.out.println(getBondById(1));
    }
}