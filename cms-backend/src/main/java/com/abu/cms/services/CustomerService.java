package com.abu.cms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abu.cms.exception.ResourceNotFoundException;
import com.abu.cms.models.Customer;
import com.abu.cms.repositories.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> findAllCustomers() {
        return repository.findAll();
    }

    public Customer findCustomerById(Long costumerId) {
        return repository.findById(costumerId).orElseThrow(() -> new ResourceNotFoundException("Costumer not found"));
    }

    public Customer newCustomer(Customer costumer) {
        return repository.save(costumer);
    }

    public Customer updateCustomer(Long customerId, Customer customer) {
        Customer existingCustomer = findCustomerById(customerId);

        existingCustomer.setId(customerId);
        existingCustomer.setFirstName(customer.getFirstName());
        existingCustomer.setLastName(customer.getLastName());
        // existingCustomer.setEmail(customer.getEmail());
        // existingCustomer.setCellPhone(customer.getCellPhone());

        return repository.save(existingCustomer);
    }
}
