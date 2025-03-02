package com.abu.cms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abu.cms.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}