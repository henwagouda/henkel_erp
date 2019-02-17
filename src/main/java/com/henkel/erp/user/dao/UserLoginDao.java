package com.henkel.erp.user.dao;

import com.henkel.erp.user.model.UserDetails;

public interface UserLoginDao {
	
	public UserDetails validateUserByEmailId(String emailId);

}
