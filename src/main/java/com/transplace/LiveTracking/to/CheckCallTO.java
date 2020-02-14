package com.transplace.LiveTracking.to;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.transplace.LiveTracking.model.CheckCall;
import com.transplace.LiveTracking.model.ShipmentInfo;

public class CheckCallTO {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String checkCalltype;
	private Date createdDateTime;
	private String locationName;
	private Double latitude;
	private Double longitude;
	private String statusDesc;
	private String statusCode;
	private String stopType;
	private String city;
	private String state;
	private String comments;
	private long shipmentId;
	
	public CheckCall covertToEntity() {
		CheckCall checkCall = new CheckCall();
		checkCall.setCheckCalltype(checkCalltype);
		checkCall.setCreatedDateTime(createdDateTime);
		checkCall.setCity(city);
		checkCall.setComments(comments);
		checkCall.setLatitude(latitude);
		checkCall.setLongitude(longitude);
		checkCall.setLocationName(locationName);
		checkCall.setState(state);
		checkCall.setStatusCode(statusCode);
		checkCall.setStatusDesc(statusDesc);
		checkCall.setStopType(stopType);
		ShipmentInfo shipmentInfo= new ShipmentInfo();
		shipmentInfo.setId(shipmentId);
		checkCall.setShipment(shipmentInfo);
		return checkCall;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckCalltype() {
		return checkCalltype;
	}

	public void setCheckCalltype(String checkCalltype) {
		this.checkCalltype = checkCalltype;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}
	
	

}
