package com.abu.cms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abu.cms.models.Customer;
import com.abu.cms.services.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/costumers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers() {
        return ResponseEntity.ok(service.findAllCustomers());
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer costumer) {
        return new ResponseEntity<>(service.newCustomer(costumer), HttpStatus.CREATED);
    }
}
