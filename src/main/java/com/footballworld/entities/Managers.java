package com.footballworld.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name="Managers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Managers{

@Id
@Column(name="managerId")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int managerId;

@Column(name="name")
private String managerName;

@Column(name="manager_place_of_birth")
private String managerPlaceOfBirth;

@Column(name="manager_nationality")
private String managerNationality;

@Column(name="manager_date_of_birth")
private Date managerDOB;

@Column(name="manager_height")
private int height;

@Column(name="current_club")
private String currentClub;

public int getManagerId() {
	return managerId;
}
public void setManagerId(int managerId) {
	this.managerId = managerId;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public String getManagerPlaceOfBirth() {
	return managerPlaceOfBirth;
}
public void setManagerPlaceOfBirth(String managerPlaceOfBirth) {
	this.managerPlaceOfBirth = managerPlaceOfBirth;
}
public String getManagerNationality() {
	return managerNationality;
}
public void setManagerNationality(String managerNationality) {
	this.managerNationality = managerNationality;
}
public Date getManagerDOB() {
	return managerDOB;
}
public void setManagerDOB(Date managerDOB) {
	this.managerDOB = managerDOB;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getCurrentClub() {
	return currentClub;
}
public void setCurrentClub(String currentClub) {
	this.currentClub = currentClub;
}
@Override
public String toString() {
	return "Managers [managerId=" + managerId + ", managerName=" + managerName + ", managerPlaceOfBirth="
			+ managerPlaceOfBirth + ", managerNationality=" + managerNationality + ", managerDOB=" + managerDOB
			+ ", height=" + height + ", currentClub=" + currentClub + "]";
}




}

