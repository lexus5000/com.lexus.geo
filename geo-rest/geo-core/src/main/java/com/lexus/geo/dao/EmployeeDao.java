package com.lexus.geo.dao;

import com.lexus.geo.model.Employee;

public class EmployeeDao 
{
	
	public Employee getEmployeeDetails(String employeeId)
	{
		Employee emp = new Employee();
		emp.setDateOfJoining("01-02-2001");
		emp.setDepartment("Sales");
		emp.setEmail("test@example.com");
		emp.setEmployeeId("675436");
		emp.setFirstName("John");
		emp.setLastName("Smith");
		return emp;
	}
}
