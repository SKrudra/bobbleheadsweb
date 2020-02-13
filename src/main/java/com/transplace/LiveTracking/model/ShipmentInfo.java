package com.transplace.LiveTracking.model;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name="ShipmentInfo")
@Data
public class ShipmentInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
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
	@Column
	private String Comments;
	@Column
	private String healthStatusCode; // change to Enum
	@Column
	private String healthReason;
	
	@OneToMany(mappedBy="shipment", fetch=FetchType.LAZY)
	@JsonManagedReference
	private List<Stop> stops;	
	@OneToMany(mappedBy="shipment", fetch=FetchType.LAZY)
	@JsonManagedReference
	private List<CheckCall> checkcalls;
	
	
//	public static ShipmentInfo getDummyData(long shipmentId) {
//		
//		Stop origin=new Stop(1l,1, "Origin","NEW YORK","NY","10021","USA","Puru");
//		Stop dest=new Stop(2l,99, "Dest","AURORA","IL","60504","USA","Puru");
//		
//		return new ShipmentInfo(shipmentId, Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), "Pending", Arrays.asList(origin,dest));
//	}


}
