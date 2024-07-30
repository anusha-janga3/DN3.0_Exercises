// com/example/repository/CustomerRepositoryImpl.java
package com.example.repository;

import com.example.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate finding a customer by id
        return new Customer(id, "John Doe");
    }
}
