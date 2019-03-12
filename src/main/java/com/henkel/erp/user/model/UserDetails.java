package com.henkel.erp.user.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetails implements Serializable {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String mobileNo;
	private String address;
	private Date dob;
	private Integer roleId;
	private String userType;
	private String companyId;
	private boolean isUserFound;
	private List<LandingPageModule> moduleList=new ArrayList<>();
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	public boolean isUserFound() {
		return isUserFound;
	}
	public void setUserFound(boolean isUserFound) {
		this.isUserFound = isUserFound;
	}
	public List<LandingPageModule> getModuleList() {
		return moduleList;
	}
	public void setModuleList(List<LandingPageModule> moduleList) {
		this.moduleList = moduleList;
	}

}
