package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;
// import com.db.grad.javaapi.model.Trades;
import com.db.grad.javaapi.service.BondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BondsController {
    @Autowired
    BondsService bondService;

    @Autowired
    SecurityRepository securityRepository;

    // @GetMapping("/bonds/random")
    // public Security getBond(){
    //     return bondService.getBond();
    // }

    @GetMapping("/bonds")
    public List<Security> getAllBonds(){
        return bondService.getAllBonds();
    }

    // @GetMapping("/bonds/matured")
    // public List<Security> getBondsMatured(){
    //     return bondService.bondsMatured();
    // }

    // @GetMapping("/bonds/maturing")
    // public List<Security> getBondsMaturing(){
    //     return bondService.bondsToMature();
    // }

    // @GetMapping("/bonds/to be settled")
    // public List<Trades> getBondsToBeSettled(){
    //     return bondService.bondsToBeSettled();
    // }

    // @GetMapping("/bonds/qualifying")
    // public List<Security> getBonds(String maturityDate){
    //     return securityService.qualifyingBonds(maturityDate);
    // }

    // @GetMapping("/bonds/{maturityDate}")
    // public List<Security> getBondsByMaturityDate(String maturityDate){
    //     return securityService.getBondsDueForMaturity(maturityDate);
    // }
}
