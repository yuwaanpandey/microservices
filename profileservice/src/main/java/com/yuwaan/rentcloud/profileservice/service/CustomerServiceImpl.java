package com.yuwaan.rentcloud.profileservice.service;

import com.yuwaan.rentcloud.common.model.Customer;
import com.yuwaan.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
}
