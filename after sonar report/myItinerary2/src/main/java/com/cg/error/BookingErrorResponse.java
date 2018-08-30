package com.cg.error;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BookingErrorResponse {

	private int status;
	private String message;

	public BookingErrorResponse() {
	}

	public BookingErrorResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}
}