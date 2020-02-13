package com.transplace.LiveTracking.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public interface TrackingService {

	public List<String> getShipmentDetailsById();
	
	public int saveCheckCalls();
	
	public List<String> getCheckCallsById();
	
}
