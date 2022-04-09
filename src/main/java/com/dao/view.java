package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Login;

public class view 
	{
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

	public String view(Login login)
	{
		String sql="select * from books" ;
		System.out.println("111111111111111111");
		 template.execute(sql);
		 return "view.jsp";	
	}
	}
