package org.main.java.employee;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	private String role;
	
	public Employee(String name, String lastName, LocalDate dateOfBirth, String role) throws Exception {
		setName(lastName);
		setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setRole(role);
	}
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if (name.isBlank()) {
			throw new Exception("Il nome non puo essere vuoto.");
		}
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws Exception {
		if(lastName.isBlank()) {
			throw new Exception("Il cognome non puo essere vuoto.");
		}
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) throws Exception {
		if(dateOfBirth.isAfter(LocalDate.now())) {
			throw new Exception("La data deve essere nel passato.");
		}
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) throws Exception {
		if (!role.toLowerCase().equals("employee") && !role.toLowerCase().equals("boss"))
			throw new Exception("Il ruolo deve essere Boss o Employee.");
		this.role = role;
	}
	
	
	
}
