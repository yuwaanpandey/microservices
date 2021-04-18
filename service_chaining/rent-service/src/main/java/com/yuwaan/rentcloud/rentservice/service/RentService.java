package com.yuwaan.rentcloud.rentservice.service;

import com.yuwaan.rentcloud.model.rent.Rent;
import com.yuwaan.rentcloud.rentservice.model.DetailResponse;

import java.util.List;


public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id);
}
