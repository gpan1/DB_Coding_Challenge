package com.db.grad.javaapi.controller;

import java.util.List;
import org.javatuples.Pair;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.BondsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class BondsController {
    @Autowired
    BondsService bondsService;

    @GetMapping("/bonds/all")
    public List<Security> getAllBonds(){
        return bondsService.getAllBonds();
    }

    @GetMapping("/bonds/{bond_id}")
    public Security getBondById(@PathVariable int bond_id){
        return bondsService.getBondById(bond_id);
    }

    @GetMapping("/bonds/get_a_user/{email}")
    public String viewUser(@PathVariable String email){ 
        return bondsService.getPassword(email);
    }

    @GetMapping("/bonds/bonds_in_book/{user_id}")
    public List<Security> getBondsByBook(@PathVariable int user_id){
        return bondsService.bondsInBooks(user_id);
    }

    @GetMapping("/bonds/view_matured{date}")
    public List<Security> getBondsMatured(@PathVariable String date){
        return bondsService.bondsMatured(date);
    }

    @GetMapping("/bonds/view_maturing{date}")
    public List<Security> getBondsMaturing(@PathVariable String date){
        return bondsService.bondsToBeMature(date);
    }

    @GetMapping("/bonds/to_be_settled/{date}")
    public List<Trade> getBondsToBeSettled(@PathVariable String date){
        return bondsService.bondsToBeSettled(date);
    }

    @GetMapping("/bonds/view_issuer_and_client/{bond_id}")
    public Pair<String, String> getIssuerAndClient(@PathVariable int bond_id){
        return bondsService.viewIssuerAndClient(bond_id);
    }

    @GetMapping("/bonds/ISINandCUSIP/{bond_id}")
    public Pair<String, String> getBondsISINandCUSIP(@PathVariable int bond_id){
        return bondsService.bondsISINandCUSIP(bond_id);
    }

    @PostMapping("/bonds/add_a_user/{email}/{password}")
    public void addUser(@PathVariable String email, @PathVariable String password){
        bondsService.addUser(email, password);
    }

    // @GetMapping("/bonds/to_be_settled")
    // public List<Trade> getBondsToBeSettled(){
    //     return bondsService.bondsToBeSettled();
    // }

    // @GetMapping("/bonds/maturing")
    // public List<Security> getBondsMaturing(){
    //     return bondsService.bondsToBeMature();
    // }

    // @GetMapping("/bonds/matured")
    // public List<Security> getBondsMatured(){
    //     return bondsService.bondsMatured();
    // }

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
