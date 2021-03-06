package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transplace.LiveTracking.model.Stop;

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {

}
