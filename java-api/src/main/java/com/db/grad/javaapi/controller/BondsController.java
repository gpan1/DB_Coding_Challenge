package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.BondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BondsController {
    @Autowired
    BondsService bondsService;

    @GetMapping("/bonds")
    public List<Security> getAllBonds(){
        return bondsService.getAllBonds();
    }
}
