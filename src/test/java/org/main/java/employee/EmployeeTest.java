package org.main.java.employee;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	static String name;
	static String lastName;
	static LocalDate dateOfBirth;
	static String role;
	static Employee e;

	@BeforeAll
	static void setup() throws Exception {
		name = "Francesco";
		lastName = "Trudu";
		dateOfBirth = LocalDate.of(1988, 10, 15);
		role = "employee";
		e = new Employee(name, lastName, dateOfBirth, role);
	}

	@Test
	@DisplayName("Test costruttore")
	public void employeeTest() {

	}

	@Test
	@DisplayName("Test nome vuoto")
	public void newEmployeeTest() {
		name = "";
		assumeTrue(name.isBlank());
		assertThrows(Exception.class, () -> e.setName(name), "Deve sollevare Eccezione se il nome è vuoto");
	}

	@Test
	@DisplayName("Test nome valido")
	public void newEmployeeTest2() {
		assumeTrue(name.isBlank());
		assertThrows(Exception.class, () -> e.setName(name), "Deve sollevare Eccezione se il nome è vuoto");
	}
}
