package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transplace.LiveTracking.dao.Stop;

public interface StopRepository extends JpaRepository<Stop, Long> {

}
