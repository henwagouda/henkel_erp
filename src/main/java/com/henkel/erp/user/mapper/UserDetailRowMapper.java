package com.henkel.erp.user.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.henkel.erp.user.model.UserDetails;

public class UserDetailRowMapper<T> implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		UserDetails userDetails=new UserDetails();
		userDetails.setId(resultSet.getInt("Id"));
		userDetails.setFirstName(resultSet.getString("FirstName"));
		userDetails.setLastName(resultSet.getString("LastName"));
		userDetails.setEmailId(resultSet.getString("EmailId"));
		userDetails.setPassword(resultSet.getString("Password"));
		userDetails.setAddress(resultSet.getString("Address"));
		userDetails.setRoleId(resultSet.getInt("RoleId"));
		userDetails.setUserType(resultSet.getString("userType"));
		return userDetails;
	}

}
