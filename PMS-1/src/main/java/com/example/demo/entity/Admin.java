package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity @Table
public class Admin {
	
	@Id
	int adID;
	public long getAdID() {
		return adID;
	}
	public void setAdID(int adID) {
		this.adID = adID;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdPassword() {
		return adPassword;
	}
	public void setAdPassword(String adPassword) {
		this.adPassword = adPassword;
	}
	String adName;
	String adPassword;
	

}
