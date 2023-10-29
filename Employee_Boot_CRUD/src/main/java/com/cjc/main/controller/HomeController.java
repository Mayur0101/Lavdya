package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Employee;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/openRegpage")
	public String preRegister()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Employee e)
	{
		hs.saveData(e);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("uname") String un, @RequestParam("pass") String ps, Model m)
	{
		List<Employee> list = hs.loginData(un,ps);
		
		if(!list.isEmpty())
		{
			m.addAttribute("list", list);
			return "success";
		}
		else
		{
			return "login";
		}
		
	}
	
	
}
