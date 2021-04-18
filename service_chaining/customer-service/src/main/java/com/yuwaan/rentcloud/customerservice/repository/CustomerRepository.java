package com.yuwaan.rentcloud.customerservice.repository;


import com.yuwaan.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 04:17
 * @Project rentcloudmodel
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
