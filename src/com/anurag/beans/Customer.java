package com.anurag.beans;

public class Customer {
	private long customerId;
	private String customerType;
	private String occupation;
	private String name;
	private String gender;
	private int age;
	private String address;

	public Customer(long customerId, String customerType, String occupation, String name, String gender, int age,
			String address) {
		this.customerId = customerId;
		this.customerType = customerType;
		this.occupation = occupation;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerType=" + customerType + ", occupation=" + occupation
				+ ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + "]";
	}

}
