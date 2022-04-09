package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.Dao;
import com.model.Login;

@Controller
public class EmpController {

	@Autowired
	Dao dao;

	@RequestMapping("/login")
	public String showform(Model m) 
	{
		System.out.println(".....1");
		m.addAttribute("command", new Login());
		System.out.println(".....2");

		return "login";
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public String save(@ModelAttribute("command") Login login)
	{

		List<Login> b = dao.loginCheck(login);

		if (b.isEmpty()) {
			return "error";
		} else {
			return "welcome";
		}
	}
	
	@RequestMapping("/show")
	public String showbooks(Model m) 
	{
		List<Login> bookskist = dao.loadbooks();	
		
		
		m.addAttribute("login", bookskist);
		
		return "view1";
	}
	
	@RequestMapping("/insert")
	public String insert(Model m,@ModelAttribute("command") Login login) 
	{
		 dao.add(login);		
		return "view1";
	}
	
	@RequestMapping("/delete")
	public String deletebooks(Model m) 
	{
		List<Login> bookskist = dao.loadbooks();	
		
		
		m.addAttribute("login", bookskist);
		
		return "delete";
	}
	
	@RequestMapping("/update")
	public String update(Model m,@ModelAttribute("command") Login login) 
	{
		 dao.update(login);	
		 
		return "view1";
	}
	@RequestMapping("/dell")
	public String deletebooks(Model m,@ModelAttribute("command") Login login) 
	{
		 System.out.println("........13"+login.getBname());
		 dao.delete(login);	
		 System.out.println("........12");
		return "welcome";
	}
	
	
	@RequestMapping("/sign_in")
	public String sign_in(Model m,@ModelAttribute("command") Login login) 
	{
		 dao.sign_in(login);		
		return "index";
	}
	

}
