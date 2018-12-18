package com.netbanking.people;

public class People {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private String address;
	private String mobile_number;
	private String people_type;
	
	public People() {
		
	}
	
	public People(int id, String name, String surname, int age, String address, String mobile_number,
			String people_type) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
		this.mobile_number = mobile_number;
		this.people_type = people_type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getPeople_type() {
		return people_type;
	}
	public void setPeople_type(String people_type) {
		this.people_type = people_type;
	}
	

}
