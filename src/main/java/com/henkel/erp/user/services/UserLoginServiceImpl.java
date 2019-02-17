package com.henkel.erp.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henkel.erp.user.dao.UserLoginDao;
import com.henkel.erp.user.model.UserDetails;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	public UserLoginDao userLoginDao;

	@Override
	public UserDetails validateUserByEmailId(String emailId) {
		return userLoginDao.validateUserByEmailId(emailId);
	}

}
