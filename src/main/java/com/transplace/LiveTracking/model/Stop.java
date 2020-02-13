package com.transplace.LiveTracking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Stop")
@Data
public class Stop implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private int stopSeq;
    private String name;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String contactName;
    @ManyToOne
    @JoinColumn(name = "shipmentId")
    private ShipmentInfo shipment;
    @OneToMany(mappedBy="stop",fetch=FetchType.LAZY)
	private List<CheckCall> checkcalls;
	
    
}
