package com.yuwaan.rentcloud.profileservice.service;

import com.yuwaan.rentcloud.common.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> getCustomers();
}
