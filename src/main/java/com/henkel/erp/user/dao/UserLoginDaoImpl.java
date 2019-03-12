package com.henkel.erp.user.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.*;
import com.henkel.erp.user.mapper.UserDetailRowMapper;
import com.henkel.erp.user.model.UserDetails;

import ch.qos.logback.core.db.dialect.MsSQLDialect;

@Repository
public class UserLoginDaoImpl implements UserLoginDao{
	
	@Autowired
	public DataSource dataSource;
	
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}



	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.setNamedParameterJdbcTemplate(new NamedParameterJdbcTemplate(dataSource));
	}



	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}



	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public UserDetails validateUserByEmailId(String emailId) {
		
		SimpleJdbcCall validateEmailTemplate=new SimpleJdbcCall(this.getDataSource()).
		withProcedureName("m_user_CheckUserByEmail").
		withoutProcedureColumnMetaDataAccess().
		returningResultSet("user_list",new UserDetailRowMapper<UserDetails>()).
		declareParameters(new SqlParameter("@pEmailId",Types.VARCHAR));
		SqlParameterSource inputParam=new MapSqlParameterSource().
		addValue("@pEmailId",emailId);
		return ((List<UserDetails>)validateEmailTemplate.execute(inputParam).get("user_list")).get(0);
	}

}
