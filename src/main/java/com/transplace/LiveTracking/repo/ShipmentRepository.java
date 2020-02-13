package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transplace.LiveTracking.dao.ShipmentInfo;

@Repository
public interface ShipmentRepository extends JpaRepository<ShipmentInfo, Long> {

}
