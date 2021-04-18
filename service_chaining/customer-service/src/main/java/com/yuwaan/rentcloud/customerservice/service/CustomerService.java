package com.yuwaan.rentcloud.customerservice.service;

import com.yuwaan.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
