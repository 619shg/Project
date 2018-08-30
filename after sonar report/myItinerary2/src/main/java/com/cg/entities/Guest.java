package com.cg.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Guest {
	private long guestID;
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String password;
	private Date createdDate;
	private Date updatedDate;
}
