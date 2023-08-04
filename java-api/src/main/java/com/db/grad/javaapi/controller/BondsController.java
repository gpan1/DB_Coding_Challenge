package com.db.grad.javaapi.controller;

import java.util.List;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trades;
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

    @GetMapping("/bonds")
    public List<Security> getAllBonds(){
        return bondsService.getAllBonds();
    }

    @GetMapping("/bonds/byId")
    public Security getBondById(@PathVariable(value = "id") long id){
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

    @GetMapping("/bonds/matured and maturing")
    public Pair<List<Security>, List<Security>> getBondsMaturedAndMaturing(){
        return bondsService.bondsMaturedAndMaturing();
    }
    // public List<Security> getBondsMaturedAndMaturing(){
    //     return bondsService.bondsMaturedAndMaturing().getValue0()
    // }

    @GetMapping("/bonds/to be settled")
    public List<Trades> getBondsToBeSettled(){
        return bondsService.bondsToBeSettled();
    }

    @GetMapping("/bonds/ISINandCUSIP/byId")
    public String getBondsISINandCUSIP(@PathVariable int id){
        return bondsService.bondsISINandCUSIP(id);
    }
}
