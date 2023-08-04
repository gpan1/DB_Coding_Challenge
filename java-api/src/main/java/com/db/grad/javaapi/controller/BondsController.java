package com.db.grad.javaapi.controller;

import java.util.List;
import com.db.grad.javaapi.model.Trades;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.BondsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BondsController {
    @Autowired
    BondsService bondsService;

    // @GetMapping("/bonds/random")
    // public Security getBond(){
    //     return bondsService.getBond();
    // } 

    /**
     * //B.P 

     @GetMapping("/bondsRange")
    public List<Security> getBondsByDateRange(){
        return bondsService.getBondsByDateRange(); //TO DO 
    }
     */

    @GetMapping("/bonds")
    public List<Security> getAllBonds(){
        return bondsService.getAllBonds();
    }

    @GetMapping("/bonds/maturing")
    public List<Security> getBondsMaturing(){
        return bondsService.bondsToMature();
    }

    @GetMapping("/bonds/matured")
    public List<Security> getBondsMatured(){
        return bondsService.bondsMatured();
    }

    @GetMapping("/bonds/to be settled")
    public List<Trades> getBondsToBeSettled(){
        return bondsService.bondsToBeSettled();
    } 

    //B.P 
    @GetMapping("/bonds/issuer")
    public String getBondsIssuer(int id){
        return bondsService.bondsIssuer(int id);
    } 

    @GetMapping("/bonds/holder")
    public String getBondsHolder(int id){
        return bondsService.bondsHolder(int id);
    }

} 
