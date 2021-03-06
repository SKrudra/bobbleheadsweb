package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transplace.LiveTracking.model.ShipmentInfo;

@Repository
public interface ShipmentRepository extends JpaRepository<ShipmentInfo, Long> {

}
