package com.cg.error;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class GuestErrorResponse {

	private int status;
	private String message;

	public GuestErrorResponse() {
	}

	public GuestErrorResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}
}