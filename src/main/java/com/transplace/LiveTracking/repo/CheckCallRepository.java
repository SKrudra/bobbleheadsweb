package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transplace.LiveTracking.dao.CheckCall;

public interface CheckCallRepository extends JpaRepository<CheckCall, Long> {

}
