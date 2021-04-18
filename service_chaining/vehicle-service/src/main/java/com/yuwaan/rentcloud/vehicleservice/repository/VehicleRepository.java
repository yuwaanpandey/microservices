package com.yuwaan.rentcloud.vehicleservice.repository;

import com.yuwaan.rentcloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
