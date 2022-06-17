package com.ojas.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entity.EmployeeEntity;
import com.ojas.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Serializable> {

	@Query(value = "select *from employee where eaddress=?1", nativeQuery = true)
	public List<EmployeeEntity> findEmployeeByAddress(String address);

	@Query(value = "select eid,ename,eaddress,eage,esal,skillset,edept,max(esal) from employee", nativeQuery = true)
	public EmployeeEntity findEmployeeBySalary();
	
	@Query(value = "select eid,ename,eaddress,eage,esal,skillset,edept,min(esal) from employee", nativeQuery = true)
	public EmployeeEntity findEmpBySalary();
	
	@Query(value="select * from employee where eage<=50", nativeQuery=true)
	public List<EmployeeEntity> findEmployeeByAge();
	
	@Query(value="select * from employee where esal between 10000 and 25000;",nativeQuery=true)
	public List<EmployeeEntity> findSalBetweenTenToTwentyFive();
	
	@Query(value="select sum(esal),edept from employee group by edept;",nativeQuery=true)
	public List<EmployeeEntity> findTotalSalDeptWise();
	
}
