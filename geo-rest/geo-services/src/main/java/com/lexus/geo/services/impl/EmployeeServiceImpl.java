package com.lexus.geo.services.impl;

 
import javax.ws.rs.core.Response;
 
import org.springframework.beans.factory.annotation.Autowired;
 
import com.lexus.geo.services.EmployeeService;
import com.lexus.geo.dao.EmployeeDao;
 
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao; 
 
	public Response getEmployeeDetail(String employeeId) 
	{
		if(employeeId == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}		
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}
}