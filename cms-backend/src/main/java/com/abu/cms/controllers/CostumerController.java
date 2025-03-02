package com.abu.cms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abu.cms.models.Costumer;
import com.abu.cms.services.CostumerService;

@RestController
@RequestMapping("/api/costumers")
public class CostumerController {

    @Autowired
    private CostumerService service;

    @GetMapping
    public ResponseEntity<List<Costumer>> findAllCostumers() {
        return ResponseEntity.ok(service.findAllCostumers());
    }

    @PostMapping("/add")
    public ResponseEntity<Costumer> newCostumer(@RequestBody Costumer costumer) {
        return new ResponseEntity<>(service.newCostumer(costumer), HttpStatus.CREATED);
    }
}
