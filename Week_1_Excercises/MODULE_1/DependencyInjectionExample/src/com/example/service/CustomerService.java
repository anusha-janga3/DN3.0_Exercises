
// com/example/service/CustomerService.java
package com.example.service;

import com.example.repository.CustomerRepository;
import com.example.model.Customer;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}
