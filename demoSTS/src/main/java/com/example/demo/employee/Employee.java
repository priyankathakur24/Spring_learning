package com.example.demo.employee;

public class Employee {

	
	private int emp_id;
	private String name;
	private Integer mobile_no;

	public int getEmp_id() {
		return emp_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", mobile_no=" + mobile_no + "]";
	}

	public Employee(int emp_id, String name, Integer mobile_no)  {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.mobile_no = mobile_no;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(Integer mobile_no) {
		this.mobile_no = mobile_no;
	}

}
