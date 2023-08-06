package com.db.grad.javaapi.service;

import java.util.*;
import java.time.LocalDate;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Service;
import org.springframework.boot.CommandLineRunner;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.BookUserRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BondsService implements CommandLineRunner{
    @Autowired
    SecurityRepository securityRepository;
    
    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private BookUserRepository bookUserRepository;
       
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
        List<Security> qualifying = new ArrayList<Security>(); //maturing bonds
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
        List<Security> qualifying = new ArrayList<Security>(); //matured bonds
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
        List<Trade> qualifying = new ArrayList<Trade>(); //trades to be settled
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
        //user_id takes me to book_user which gives me book_id, go into trades and print corresponding bonds for that book_id with matching security_id
    public List<Security> bondsInBooks(int user_id){
        System.out.println("check 1");
        List<BookUser> bookUsers = bookUserRepository.findAll(); 
        List<Trade> trades = tradeRepository.findAll(); 
        List<Security> bonds = securityRepository.findAll(); 
        List<Security> qualifying = new ArrayList<Security>(); //bonds in books
        //get book_id from book_user where user_id = user_id
        //get security_id from trades where book_id = book_id
        //get bonds from securities where id = security_id
        System.out.println("check 2");
        for (BookUser bookUser : bookUsers) { //for each book_user
            System.out.println("check 3"); 
            System.out.println("book user id: " + bookUser.getUsers_id().getId());
            if (bookUser.getUsers_id().getId() == user_id) { 
                System.out.println("check 4"); 
                for (Trade trade : trades) { 
                    System.out.println("trade book id: " + trade.getBook_id().getId());
                    System.out.println("book user book id: " + bookUser.getBook_id().getId());
                    if (trade.getBook_id().getId() == bookUser.getBook_id().getId()) { 
                        System.out.println("check 5"); 
                        for (Security bond : bonds) {       
                            System.out.println("check 6");  
                            System.out.println("bond id: " + bond.getId());                
                            System.out.println("trade security id: " + trade.getSecurity_id().getId());
                            if (bond.getId() == trade.getSecurity_id().getId()) { 
                                qualifying.add(bond); 
                            }
                        }
                    }
                }
            }
        }
        return qualifying; 
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Testing");
        System.out.println(LocalDate.parse("2023-08-03"));
        System.out.println(bondsISINandCUSIP(0));
        // System.out.println(bondsMaturedAndMaturing());
        System.out.println(getBondById(1));
        // call bondsInBooks with user_id
        System.out.println("bonds in books: " + bondsInBooks(1));
    }
}