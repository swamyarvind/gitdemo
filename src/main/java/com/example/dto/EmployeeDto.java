package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDto {

	 @NotBlank(message = "Employee name cannot be blank")
	 private String name;

	 @Email(message = "Please provide a valid email address")
	    @NotBlank(message = "Email is required")
	 private String email;

	  @NotNull(message = "Department ID must be specified")
	 private Long departmentId;

}
