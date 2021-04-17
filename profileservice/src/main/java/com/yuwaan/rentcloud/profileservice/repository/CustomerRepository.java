package com.yuwaan.rentcloud.profileservice.repository;

import com.yuwaan.rentcloud.common.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
