package com.db.grad.javaapi.controller;

import java.util.List;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.BondsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BondsController {
    @Autowired
    BondsService bondsService;

    @GetMapping("/bonds/testing")
    public String getBond(){
        return bondsService.getBond();
    }

    @GetMapping("/bonds/all")
    public List<Security> getAllBonds(){
        return bondsService.getAllBonds();
    }

    @GetMapping("/bonds/{id}")
    public Security getBondById(@PathVariable int id){
        return bondsService.getBondById(id);
    }

    @GetMapping("/bonds/maturing")
    public List<Security> getBondsMaturing(){
        return bondsService.bondsToBeMature();
    }

    @GetMapping("/bonds/matured")
    public List<Security> getBondsMatured(){
        return bondsService.bondsMatured();
    }

    @GetMapping("/bonds/to be settled")
    public List<Trade> getBondsToBeSettled(){
        return bondsService.bondsToBeSettled();
    }

    @GetMapping("/bonds/ISINandCUSIP/{id}")
    public Pair<String, String> getBondsISINandCUSIP(@PathVariable int id){
        return bondsService.bondsISINandCUSIP(id);
    }

    @GetMapping("/bonds/bonds in book/{id}")
    public List<Security> getBondsByBook(@PathVariable int id){
        return bondsService.bondsInBooks(id);
    }

    @GetMapping("/bonds/view issuer and client/{id}")
    public Pair<String, String> getIssuerAndClient(@PathVariable int id){
        return bondsService.viewIssuerAndClient(id);
    }

    // @GetMapping("/bonds/issuer name/{id}")
    // public String viewIssuer(@PathVariable int id){
    //     return bondsService.viewIssuer(id);
    // }

    // @GetMapping("/bonds/view client name/{id}")
    // public String getClientName(@PathVariable int id){
    //     return bondsService.viewClient(id);
    // }

    // @GetMapping("/bonds/ISINandCUSIP/{id}")
    // public String getBondsISINandCUSIP(@PathVariable int id){
    //     return bondsService.bondsISINandCUSIP(id);
    // }

    // @GetMapping("/bonds/matured and maturing")
    // public Pair<List<Security>, List<Security>> getBondsMaturedAndMaturing(){
    //     return bondsService.bondsMaturedAndMaturing();
    // }
}
