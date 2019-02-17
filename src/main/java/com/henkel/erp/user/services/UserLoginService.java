package com.henkel.erp.user.services;

import com.henkel.erp.user.model.UserDetails;

public interface UserLoginService {
	
	public UserDetails validateUserByEmailId(String emailId);

}
