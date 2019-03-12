package com.henkel.erp.user.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.henkel.erp.user.model.LandingPageModule;
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
		userDetails.setUserFound(true);
		//For Now its hard coded but on roleId basic we can load module with user object
		LandingPageModule ssMod=new LandingPageModule("Secondary Sales","1","Sales");
		LandingPageModule mkDataMod=new LandingPageModule("Market Data","2","MarketData");
		LandingPageModule distMod=new LandingPageModule("Distributor Appointment","3","DMT");
		LandingPageModule adminMod=new LandingPageModule("Admin","4","admin");
		userDetails.getModuleList().add(ssMod);
		userDetails.getModuleList().add(mkDataMod);
		userDetails.getModuleList().add(distMod);
		//userDetails.getModuleList().add(adminMod);
		
		return userDetails;
	}

}
