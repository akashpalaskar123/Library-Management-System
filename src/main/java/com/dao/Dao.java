package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Login;
import com.rowmapper.LoginRowMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	
	public List<Login> loadbooks()
	{    
	    String sql="select * from books ";  
	    
//	    List<Login> listofbooks = template.query(sql,new LoginRowMapper());     
//	    return listofbooks;    
	    
		return template.query(sql, new RowMapper<Login>() 
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
		});    
	} 
	
   
	public int add(Login p)
	{    
	    String sql="insert into books values('"+p.getBname()+"','"+p.getBauthor()+"',"+p.getBprice()+")";     
	    return template.update(sql);    
	} 
	
	public int sign_in(Login p)
	{    
	    String sql="insert into students values('"+p.getUname()+"','"+p.getPass()+"')";  
	    System.out.println(sql);
	    return template.update(sql);    
	} 
	
	
	public int update(Login p){
		System.out.println("*****6");
//	    String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
	    String sql ="UPDATE books SET bauthor = '" +p.getBauthor()+"', bprice= "+p.getBprice()+" WHERE bname ='"+p.getBname()+"'; ";
	    return template.update(sql);    
	}    
	public int delete(Login p)
	{    
	    String sql="delete from books where bname ='"+p.getBname()+"'; ";   
	    System.out.println("........12"+sql);
	    return template.update(sql);    
	}    
	

	
	public List<Login> loginCheck(Login login)
	{
		String sql="select sname,pass from students where sname='" + login.getUname()+"' and pass='"+login.getPass()+"'" ;
	
		return template.query(sql, new RowMapper<Login>() 
		{
		
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				Login l=new Login();
				l.setUname(rs.getString(1));
				l.setPass(rs.getString(2));
				 
				return l;
			}
		});

	}
	
	
    
}
