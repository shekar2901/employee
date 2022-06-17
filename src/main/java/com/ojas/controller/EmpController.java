package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Employee;
import com.ojas.service.EmployeeServiceImpl;

@RestController
public class EmpController {
	@Autowired
	private EmployeeServiceImpl empimp;
	
	@GetMapping("/getdata/{address}")
	public List<Employee> getData(@PathVariable("address") String address){
		 List<Employee> emp=empimp.getEmpDataBelogHyd(address);
		return emp;
		
	}
	@GetMapping("/getempsaldata")
	public Employee getEmployeeHeighestSal(){
		 Employee emp=empimp.getHeighestSal();
		return emp;
		
	}
	
	@GetMapping("/getempminsaldata")
	public Employee getEmployeeLowestSalary(){
		 Employee emp=empimp.getLowSal();
		return emp;

	}
	
	@GetMapping("/getempage")
	public List<Employee> getEmployeeAge50() {
		List<Employee> emp=empimp.getEmployeesAgeLess50();
		
		return emp;
	}
	
	@GetMapping("/getsalbetween10To25")
	public List<Employee> getEmployeeSalBetween10and25(){
		List<Employee> emp=empimp.getEmpDataSalBetweenTenToTwentyFiveThousound();
		
		return emp;
	}
	
	public List<Employee> getEmployeesalwithdept(){
		List<Employee> emp=empimp.totalSalDeptWise();
		return emp;
	}
	
	
}
