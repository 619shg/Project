package com.cg.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Guest;
import com.cg.service.GuestService;

@RestController
@RequestMapping("/guest")
public class GuestRestController {

	@Autowired
	private GuestService guestService;

	@PostMapping("/register")
	public Guest createGuest(@RequestBody Guest guest) {
		guestService.registerGuest(guest);
		return guest;
	}
	
	@PostMapping("/login")
			public Guest loginGuest(@RequestBody Guest guest) {
		guestService.loginGuest(guest);		
		return guest;
			}
}