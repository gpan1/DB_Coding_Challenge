package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class SecurityController {
    @Autowired
    SecurityService securityService;

    //view all bonds
    @GetMapping("/bonds")
    public List<Security> getAllBonds(){
        return securityService.getAllBonds();
    }

    //view Bonds due for maturity within the last and next 5 days, based on maturity date ********(how to limit to 5 days?)********
    @GetMapping("/bonds/{maturityDate}")
    public List<Security> getBondsByMaturityDate(@PathVariable String maturityDate){
        return securityService.getBondsByMaturityDate(maturityDate);
    }

}
