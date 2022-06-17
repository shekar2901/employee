package com.ojas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.EmployeeEntity;
import com.ojas.model.Employee;
import com.ojas.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository erepo;

	@Override
	public List<Employee> getEmpDataBelogHyd(String address) {
		List<Employee> emplist = new ArrayList<Employee>();

		List<EmployeeEntity> e = erepo.findEmployeeByAddress(address);
		e.forEach(emp1 -> {
			Employee emp = new Employee();
			BeanUtils.copyProperties(emp1, emp);

			emplist.add(emp);
		});

		return emplist;
	}

	@Override
	public Employee getHeighestSal() {

		EmployeeEntity e = erepo.findEmployeeBySalary();

		Employee emp = new Employee();
		BeanUtils.copyProperties(e, emp);

		return emp;
	}

	@Override
	public Employee getLowSal() {
		
		EmployeeEntity e = erepo.findEmpBySalary();

		Employee emp = new Employee();
		BeanUtils.copyProperties(e, emp);
		
		return emp;
	}

	@Override
	public List<Employee> getEmployeesAgeLess50() {
		List<Employee> emplist = new ArrayList<Employee>();

		List<EmployeeEntity> e =  erepo.findEmployeeByAge();
		e.forEach(emp1 -> {
			Employee emp = new Employee();
			BeanUtils.copyProperties(emp1, emp);

			emplist.add(emp);
		});

		return emplist;
		
		
	
	}

	@Override
	public List<Employee> getEmpDataSalBetweenTenToTwentyFiveThousound() {
		List<Employee> emplist = new ArrayList<Employee>();
		List<EmployeeEntity> e =  erepo.findSalBetweenTenToTwentyFive();
		e.forEach(emp1->{
			Employee emp = new Employee();
			BeanUtils.copyProperties(emp1, emp);

			emplist.add(emp);	
			
			});
		
		return emplist;
	}

	@Override
	public List<Employee> totalSalDeptWise() {
		List<Employee> emplist = new ArrayList<Employee>();
		List<EmployeeEntity> e =  erepo.findTotalSalDeptWise();
		e.forEach(emp1->{
			Employee emp = new Employee();
			BeanUtils.copyProperties(emp1, emp);

			emplist.add(emp);	
			
			});
		
		return emplist;
		
		

	}

}
