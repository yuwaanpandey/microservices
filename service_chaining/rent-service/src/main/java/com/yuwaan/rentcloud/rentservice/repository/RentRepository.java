package com.yuwaan.rentcloud.rentservice.repository;

import com.yuwaan.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RentRepository extends JpaRepository<Rent, Integer> {
}
