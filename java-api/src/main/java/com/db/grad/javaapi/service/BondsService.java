package com.db.grad.javaapi.service;

import java.util.*;
import java.time.LocalDate;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.BookUser;
import com.db.grad.javaapi.model.Login;
import com.db.grad.javaapi.model.Security;
import org.springframework.stereotype.Service;
import org.springframework.boot.CommandLineRunner;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.UserRepository;
import com.db.grad.javaapi.repository.BookUserRepository;
import com.db.grad.javaapi.repository.LoginRepository;
import com.db.grad.javaapi.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BondsService implements CommandLineRunner{
    @Autowired
    SecurityRepository securityRepository;
    
    @Autowired
    TradeRepository tradeRepository;

    @Autowired
    BookUserRepository bookUserRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    LoginRepository loginRepository;
       
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

    public List<Security> bondsToBeMature(String date){ //look at next 5 days
        List<Security> bonds = securityRepository.findAll();
        List<Security> qualifying = new ArrayList<Security>(); //maturing bonds
        for (Security bond : bonds) {
            if (LocalDate.parse(bond.getMaturityDate()).isAfter(LocalDate.parse(date).minusDays(1)) && LocalDate.parse(bond.getMaturityDate()).isBefore(LocalDate.parse(date).plusDays(5))) {
                qualifying.add(bond);
            }
        }
        return qualifying;
    }  

    public List<Security> bondsMatured(String date){ //look at last 5 days
        List<Security> bonds = securityRepository.findAll();
        List<Security> qualifying = new ArrayList<Security>(); //matured bonds
        for (Security bond : bonds) {
            if (LocalDate.parse(bond.getMaturityDate()).isAfter(LocalDate.parse(date).minusDays(5)) && LocalDate.parse(bond.getMaturityDate()).isBefore(LocalDate.parse(date))) {
                qualifying.add(bond);
            }
        }
        return qualifying;
    } 

    public List<Trade> bondsToBeSettled(String date){ //compare settlement date to a date
        List<Trade> trades = tradeRepository.findAll();
        List<Trade> qualifying = new ArrayList<Trade>(); //trades to be settled
        for (Trade trade : trades) {
            if (LocalDate.parse(trade.getSettlementDate()).isAfter(LocalDate.parse(date))) {
                qualifying.add(trade);
            }
        }
        return qualifying;
    }

    public Pair<String, String> bondsISINandCUSIP(int id){ //view a Bond’s ISIN and CUSIP code
        List<Security> bonds = securityRepository.findAll();
        return new Pair<String, String>(bonds.get(id).getIsin(), bonds.get(id).getCusip()); //0-indexed;
    }

    // as a user I want to be able to see bonds in books I am responsible for
        //user_id takes me to book_user which gives me book_id, go into trades and print corresponding bonds for that book_id with matching security_id
        //get book_id from book_user where user_id = user_id
        //get security_id from trades where book_id = book_id
        //get bonds from securities where id = security_id
    public List<Security> bondsInBooks(int user_id){
        System.out.println("check 1");
        List<BookUser> bookUsers = bookUserRepository.findAll(); 
        List<Trade> trades = tradeRepository.findAll(); 
        List<Security> bonds = securityRepository.findAll(); 
        List<Security> qualifying = new ArrayList<Security>(); //bonds in books
        for (BookUser bookUser : bookUsers) { //for each book_user
            if (bookUser.getUsers_id().getId() == user_id) { 
                for (Trade trade : trades) { 
                    if (trade.getBook_id().getId() == bookUser.getBook_id().getId()) { 
                        for (Security bond : bonds) {       
                            if (bond.getId() == trade.getSecurity_id().getId()) { 
                                qualifying.add(bond); 
                            }
                        }
                    }
                }
            }
        }
        return new ArrayList<>(new HashSet<>(qualifying));
    }

    // view the issuer and client(bond holder) of a bond
        //given security_id as bond id, get counterparty_id from trades
        //given counterparty_id, get client_name from counterparties using counterparty_id
    // public Pair<String, String> viewIssuerAndClient(int id){ //view the client of the bond = bond holder
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Trade> trades = tradeRepository.findAll();
    //     for (Security bond : bonds) {
    //         if (bond.getId() == id) {
    //             for (Trade trade : trades) {
    //                 if (trade.getSecurity_id().getId() == bond.getId()) {
    //                     return new Pair<String, String>(bonds.get(id).getIssuerName(), trade.getCounterparty_id().getName());
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }
    public String viewIssuerAndClient(int id){ //view the client of the bond = bond holder
        List<Security> bonds = securityRepository.findAll();
        List<Trade> trades = tradeRepository.findAll();
        for (Security bond : bonds) {
            if (bond.getId() == id) {
                for (Trade trade : trades) {
                    if (trade.getSecurity_id().getId() == bond.getId()) {
                        return trade.getCounterparty_id().getName(); //client name
                    }
                }
            }
        }
        return null;
    }
    
    public String getPassword(String email){
        List<Login> login = loginRepository.findAll();
        for (Login user : login) {
            if (user.getEmail().equals(email)) {
                return user.getPassword(); 
            }
        }
        return null;
    }

    public Login addUser(String name, String email, String password){
        Login user = new Login(name, email, password);
        loginRepository.save(user);
        return user;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*** Testing ***");
        // System.out.println("*** bonds to be mature: " + bondsToBeMature("2021-08-09") + "***");
        // System.out.println("*** bonds matured: " + bondsMatured("2021-08-10") + "***");
        // System.out.println("*** convert string to date: " + LocalDate.parse("2023-08-03") + "***");
        // System.out.println(bondsISINandCUSIP(0)); //0-indexed
        // System.out.println(bondsMaturedAndMaturing());
        // System.out.println("*** issuer: " + viewIssuer(1) + "***"); //0-indexed
        // System.out.println("*** client: " + viewClient(1) + "***"); //1-indexed
        // System.out.println("*** bond by id: " + getBondById(1) + "***"); //1-indexed
        // System.out.println("*** bonds in books: " + bondsInBooks(2) + "***"); //1-indexed
        // System.out.println("*** counterparty: " + viewIssuerAndClient(1) + "***"); //0-indexed, 1-indexed
        // System.out.println("*** password: " + getPassword("AcmeCo@email.com"));
    }
}

    // public String viewIssuer(int id){ //view the issuer of the bond
    //     List<Security> bonds = securityRepository.findAll();
    //     return bonds.get(id).getIssuerName(); //0-indexed
    // }

    // public List<Trade> bondsToBeSettled(){ //compare settlement date to today's date
    //     List<Trade> trades = tradeRepository.findAll();
    //     List<Trade> qualifying = new ArrayList<Trade>(); //trades to be settled
    //     LocalDate today = LocalDate.now(); //today's date
    //     for (Trade trade : trades) {
    //         if (LocalDate.parse(trade.getSettlementDate()).isAfter(today)) {
    //             qualifying.add(trade);
    //         }
    //     }
    //     return qualifying;
    // }

    // public String viewClient(int id){ //view the client of the bond = bond holder
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Trade> trades = tradeRepository.findAll();
    //     for (Security bond : bonds) {
    //         if (bond.getId() == id) {
    //             for (Trade trade : trades) {
    //                 if (trade.getSecurity_id().getId() == bond.getId()) {
    //                     return trade.getCounterparty_id().getName();
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }

     // public List<Security> bondsToBeMature(){ //look at next 5 days
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Security> qualifying = new ArrayList<Security>(); //maturing bonds
    //     LocalDate today = LocalDate.now(); //today's date
    //     for (Security bond : bonds) {
    //         if (LocalDate.parse(bond.getMaturityDate()).isAfter(today) && LocalDate.parse(bond.getMaturityDate()).isBefore(today.plusDays(5))) {
    //             qualifying.add(bond);
    //         }
    //     }
    //     return qualifying;
    // }

    // public List<Security> bondsMatured(){ //look at last 5 days
    //     List<Security> bonds = securityRepository.findAll();
    //     List<Security> qualifying = new ArrayList<Security>(); //matured bonds
    //     LocalDate today = LocalDate.now(); //today's date
    //     for (Security bond : bonds) {
    //         if (LocalDate.parse(bond.getMaturityDate()).isAfter(today.minusDays(5)) && LocalDate.parse(bond.getMaturityDate()).isBefore(today)) {
    //             qualifying.add(bond);
    //         }
    //     }
    //     return qualifying;
    // }

    // public String bondsISINandCUSIP(int id){ //view a Bond’s ISIN and CUSIP code
    //     List<Security> bonds = securityRepository.findAll();
    //     Pair<String, String> isinAndCusip = new Pair<String, String>(bonds.get(id).getIsin(), bonds.get(id).getCusip()); //0-indexed
    //     return "ISIN Code: " + isinAndCusip.getValue0() + "\n" + "CUSIP Code: " + isinAndCusip.getValue1();
    // }

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