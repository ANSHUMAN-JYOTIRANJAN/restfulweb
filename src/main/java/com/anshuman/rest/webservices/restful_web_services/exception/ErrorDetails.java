package com.anshuman.rest.webservices.restful_web_services.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
	// timeStamp
	private LocalDateTime timestamp;
	//message
	private String message;
	
	private String details;
	//details
	
	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	
	
}
