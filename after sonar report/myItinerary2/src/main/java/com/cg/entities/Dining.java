package com.cg.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Dining {
	private long dReservationNumber;
	private String diningType;
	private Date arrivalDate;
	private int noOfPeople;
	private String status;
	private Date createdDate;
	private Date updatedDate;

	private long guestID;

}