package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Employee {

	private int empid;

	private String empname;

	private int empage;
	private int empsal;

	private String empskillset;

	private String empaddress;

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
