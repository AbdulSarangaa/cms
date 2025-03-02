package com.abu.cms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abu.cms.models.Costumer;

public interface CostumerRepository extends JpaRepository<Costumer, Long> {

}