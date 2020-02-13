package com.transplace.LiveTracking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.transplace.LiveTracking.dao.CheckCall;
import com.transplace.LiveTracking.dao.ShipmentInfo;
import com.transplace.LiveTracking.repo.CheckCallRepository;
import com.transplace.LiveTracking.repo.ShipmentRepository;
import com.transplace.LiveTracking.service.TrackingService;

@RestController
public class TrackingController {
	
	@Autowired
	private ShipmentRepository shipmentRepo;
	@Autowired
	private CheckCallRepository checkCallRepository;
	
	@GetMapping("shipmentDetails")
	public ResponseEntity<ShipmentInfo> getshipmentDetails(@RequestParam("shipId") long shipmentId){
		Optional<ShipmentInfo> shipmentInfo = shipmentRepo.findById(shipmentId);
		
		return new ResponseEntity<ShipmentInfo>(shipmentInfo.get(), HttpStatus.OK);
	}
	
	@RequestMapping("saveCheckCall")
	public void updateCheckCalls() {
		//checkCallRepository.save()
		
		
	}

}
