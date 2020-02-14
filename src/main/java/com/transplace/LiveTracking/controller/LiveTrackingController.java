package com.transplace.LiveTracking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transplace.LiveTracking.model.CheckCall;
import com.transplace.LiveTracking.model.ShipmentInfo;
import com.transplace.LiveTracking.repo.CheckCallRepository;
import com.transplace.LiveTracking.repo.ShipmentRepository;

@RestController
public class LiveTrackingController {

	@Autowired
	private ShipmentRepository shipmentRepo;
	@Autowired
	private CheckCallRepository checkCallRepository;
	
	@GetMapping("getshipmentDetails")
	public ResponseEntity<ShipmentInfo> getshipmentDetails(@RequestParam("shipId") long shipmentId){
		Optional<ShipmentInfo> shipmentInfo = shipmentRepo.findById(shipmentId);
		
		return new ResponseEntity<ShipmentInfo>(shipmentInfo.get(), HttpStatus.OK);
	}
	
	@GetMapping("getCheckCalls")
	public ResponseEntity<List<CheckCall>> getCheckCalls(@RequestParam("shipId") Long  shipmentId, @RequestParam(name="checkCallId",required=false) Long  checkCallId){
		checkCallId=checkCallId==null?0:checkCallId;
		Optional<List<CheckCall>> checkCalls = checkCallRepository.findByShipmentIdAndIdGreaterThan(shipmentId,checkCallId);
		if(checkCalls.isPresent()) {
			return new ResponseEntity<List<CheckCall>>(checkCalls.get(),HttpStatus.OK);
		}
		return new ResponseEntity<List<CheckCall>>(HttpStatus.NO_CONTENT);
	}
}
