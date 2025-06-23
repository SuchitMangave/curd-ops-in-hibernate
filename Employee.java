package com.jbk;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empData")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empID;
	String empName;
	@Column(name = "state")
	String city;
	String Salary;
	String Dept;

	public Employee() {

	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public Employee(int empID, String empName, String city, String salary, String dept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.city = city;
		Salary = salary;
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", city=" + city + ", Salary=" + Salary + ", Dept="
				+ Dept + "]";
	}

}
