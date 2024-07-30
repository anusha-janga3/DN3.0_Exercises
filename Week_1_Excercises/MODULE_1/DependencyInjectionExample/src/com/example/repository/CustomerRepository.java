// com/example/repository/CustomerRepository.java
package com.example.repository;

import com.example.model.Customer;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
