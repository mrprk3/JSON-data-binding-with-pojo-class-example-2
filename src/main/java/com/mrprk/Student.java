package com.mrprk;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties(value = "isActive")
//@JsonIgnoreProperties(value = {"isActive","name"}) // it will not bind the this two properties

public class Student {

	private String name;
	private String address;
	@JsonProperty("isActive")   // to fix the proble or else change the getter method
	private boolean isActive;
	private String [] phoneNo;
	private BatchInfo batch;
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", isActive=" + isActive + ", phoneNo="
				+ Arrays.toString(phoneNo) + ", batch=" + batch + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String [] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String [] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public BatchInfo getBatch() {
		return batch;
	}
	public void setBatch(BatchInfo batch) {
		this.batch = batch;
	}

}
