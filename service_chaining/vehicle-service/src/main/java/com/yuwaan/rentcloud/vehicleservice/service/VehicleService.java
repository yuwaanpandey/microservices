package com.yuwaan.rentcloud.vehicleservice.service;

import com.yuwaan.rentcloud.model.vehicle.Vehicle;

import java.util.List;

public interface VehicleService {
    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}
