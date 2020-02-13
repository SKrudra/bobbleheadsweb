package com.transplace.LiveTracking.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transplace.LiveTracking.model.CheckCall;

@Repository
public interface CheckCallRepository extends JpaRepository<CheckCall, Long> {

	public Optional<List<CheckCall>> findByShipmentIdAndIdGreaterThan(long shipmentId,long checkCallId);
}
