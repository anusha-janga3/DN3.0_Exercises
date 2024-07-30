// com/example/main/DependencyInjectionExample.java
package com.example.test;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;
import com.example.model.Customer;

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("1");
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
