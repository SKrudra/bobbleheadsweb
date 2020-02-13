package com.transplace.LiveTracking.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transplace.LiveTracking.model.CheckCall;
import com.transplace.LiveTracking.model.ShipmentInfo;
import com.transplace.LiveTracking.repo.CheckCallRepository;
import com.transplace.LiveTracking.repo.ShipmentRepository;

@RestController
public class TrackingController {
	
	@Autowired
	private ShipmentRepository shipmentRepo;
	@Autowired
	private CheckCallRepository checkCallRepository;
	
	@GetMapping("shipmentDetails")
	public ResponseEntity<ShipmentInfo> getShipmentDetails(@RequestParam(name="shipId", required=false ) Long shipmentId){
		if(shipmentId == null) {
		List<ShipmentInfo> shipmentInfos = shipmentRepo.findAll();
		List<ShipmentInfo> selectedShipmentInfo = new ArrayList<>();
		shipmentInfos.forEach((shipment)->{
			if("TENDER ACCEPT".equals(shipment.getStatus())) {
				selectedShipmentInfo.add(shipment);
			}
		});
		if (selectedShipmentInfo.size()>0) {
			return new ResponseEntity<ShipmentInfo>(selectedShipmentInfo.get(0), HttpStatus.OK);
		}
		} else {
			Optional<ShipmentInfo> shipmentInfo = shipmentRepo.findById(shipmentId);
			if(shipmentInfo.isPresent()) {
				return new ResponseEntity<ShipmentInfo>(shipmentInfo.get(), HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<ShipmentInfo>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping("saveCheckCall")
	public void updateCheckCalls(@RequestBody CheckCall checkCall) {
		
		checkCallRepository.save(checkCall);
		
	}

}
