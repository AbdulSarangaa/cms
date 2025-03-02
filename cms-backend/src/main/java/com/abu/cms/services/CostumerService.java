package com.abu.cms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abu.cms.models.Costumer;
import com.abu.cms.repositories.CostumerRepository;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository repository;

    public List<Costumer> findAll() {
        return repository.findAll();
    }

}
