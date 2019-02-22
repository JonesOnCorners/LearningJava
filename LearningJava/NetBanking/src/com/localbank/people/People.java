package com.localbank.people;

public class People {
	
	private int id;
	private String name;
	private String surname;
	private int age;
	private String address;
    private long mobile;
    private String type;
    
    public People() {
    	
    }
    
	public People(int id, String name, String surname, int age, String address, long mobile, String type) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
		this.mobile = mobile;
		this.type = type;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
