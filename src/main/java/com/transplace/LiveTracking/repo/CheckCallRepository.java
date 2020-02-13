package com.transplace.LiveTracking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transplace.LiveTracking.dao.CheckCall;

@Repository
public interface CheckCallRepository extends JpaRepository<CheckCall, Long> {

}
