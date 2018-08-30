package com.cg.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Resort {
	private long rReservationNumber;
	private String roomType;
	private Date arrivalDate;
	private Date departureDate;
	private int noOfPeople;
	private String status;
	private Date createdDate;
	private Date updatedDate;

	private long guestID;

}
