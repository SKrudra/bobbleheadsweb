package com.transplace.LiveTracking.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ShipmentInfo")
@Data
public class ShipmentInfoDAO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@OneToMany
	@Column
	private List<Stop> stops;
	@Column
	private Date earliestOriginDate;
	@Column
	private Date latestOriginDate;
	@Column
	private Date earliestDestinationDate;
	@Column
	private Date latestDestinationDate;
	@Column
	private String status;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<CheckCall> checkcalls;
		
}
