package com.ojas.service;

import java.util.List;

import com.ojas.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmpDataBelogHyd(String address);
	public  Employee getHeighestSal();  
	public  Employee getLowSal();
	public List<Employee> getEmployeesAgeLess50();
	public List<Employee> getEmpDataSalBetweenTenToTwentyFiveThousound();
	public List<Employee> totalSalDeptWise();
	
	
	

}
