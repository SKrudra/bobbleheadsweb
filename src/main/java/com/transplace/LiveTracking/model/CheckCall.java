package com.transplace.LiveTracking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name = "CheckCall")
@Data

public class CheckCall implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String checkCalltype;
	@JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
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
	@ManyToOne
	@JoinColumn(name="shipmentId", nullable=false)
	@JsonBackReference//	@JsonManagedReference
	private ShipmentInfo shipment;
	
}
