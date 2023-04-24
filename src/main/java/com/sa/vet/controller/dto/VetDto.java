package com.sa.vet.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Parameterized constructor
@NoArgsConstructor // Default constructor
@Data // Getters and setter
@Builder
public class VetDto {

	private long npiNo;
	private String userName;
	private String firstName;
	private String lastName;
	private String avatar;
	private String department;
	private String dob;
	private String gender;
	private String clinic;
	private long mobileNo;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private boolean status;
	private String shortBiography;
	private long departmentId;

}
