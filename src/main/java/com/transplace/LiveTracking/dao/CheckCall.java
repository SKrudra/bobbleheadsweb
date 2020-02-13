package com.transplace.LiveTracking.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CheckCall")
@Data
public class CheckCall {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private Date createdDateTime;
	private String locationName;
	private Double latitude;
	private Double longitude;
	private String statusDesc;
	private String statusCode;
	private String stopType;
	private String city;
	private String state;
	@ManyToOne
	@JoinColumn(name = "shipmentId")
	private ShipmentInfoDAO shipment;
	@ManyToOne
	@JoinColumn(name = "stopId")
	private Stop stop;
}
