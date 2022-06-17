package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@Column(name="eid")
	private int empid;
	@Column(name="ename")
	private String empname;	
	@Column(name="eage")
	private int empage;
	@Column(name="esal")
	private int empsal;
	@Column(name="skillset")
	private String empskillset;
	@Column(name="eaddress")
	private String empaddress;
	@Column(name="edept")
	private String empdept;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpskillset() {
		return empskillset;
	}
	public void setEmpskillset(String empskillset) {
		this.empskillset = empskillset;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	

}
