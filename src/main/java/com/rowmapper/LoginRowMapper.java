package com.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Login;

public class LoginRowMapper implements RowMapper<Login> 
{

	public Login mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Login login = new Login();
		System.out.println("**********1");
		login.setBname(rs.getString("bname"));
		login.setBauthor(rs.getString("bauthor"));
		login.setBprice(rs.getInt("bprice"));
		
		return login;
	}

}