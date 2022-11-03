package com.constructor.injection;

public class Employee {
	
	private String name;
	private String mail;
	private int salary;
	private Address address;
	
	public Employee(String name, String mail, int salary, Address address) {
		super();
		this.name = name;
		this.mail = mail;
		this.salary = salary;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mail=" + mail + ", salary=" + salary + ", address=" + address + "]";
	}
	

}
