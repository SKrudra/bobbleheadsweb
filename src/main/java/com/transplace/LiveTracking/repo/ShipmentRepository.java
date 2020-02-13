package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transplace.LiveTracking.dao.ShipmentInfo;

public interface ShipmentRepository extends JpaRepository<ShipmentInfo, Long> {

}
