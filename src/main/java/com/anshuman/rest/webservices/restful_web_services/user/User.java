package com.anshuman.rest.webservices.restful_web_services.user;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	private Integer id;

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, message = "Name should have at least 2 characters")
    @JsonProperty("user_name")
	private String name;
    @NotNull(message = "Birth date is required")
    @Past(message = "Birth date must be in the past")
	private LocalDate birthDate;
	public User() {
		
	}
	public User(Integer id, String name, LocalDate birthDate) {
		//super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthData
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthData the birthData to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [Id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
