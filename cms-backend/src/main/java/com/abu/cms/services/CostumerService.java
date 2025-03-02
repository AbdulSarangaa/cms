package com.abu.cms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abu.cms.exception.ResourceNotFoundException;
import com.abu.cms.models.Costumer;
import com.abu.cms.repositories.CostumerRepository;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository repository;

    public List<Costumer> findAllCostumers() {
        return repository.findAll();
    }

    public Costumer findCostumerById(Long costumerId) {
        return repository.findById(costumerId).orElseThrow(() -> new ResourceNotFoundException("Costumer not found"));
    }

    public Costumer newCostumer(Costumer costumer) {
        return repository.save(costumer);
    }
}
