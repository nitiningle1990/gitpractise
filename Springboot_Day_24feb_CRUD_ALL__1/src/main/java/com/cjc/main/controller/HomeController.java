package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@Controller
public class HomeController {
 
	@Autowired
	HomeServiceI seo;
	
	@RequestMapping(value="/")
	public String prelogin()
	{
     return"login";
	}
	
	@RequestMapping(value = "/registerpage")
	public String reg() {
		
		return "register";
	}
	
	@RequestMapping(value = "/save")
	public String savedata(@ModelAttribute Student s)
	{
	 seo.savedata(s);	
		return "login";
	}
	
	@RequestMapping(value = "/login")
	public String showall(@RequestParam String username,@RequestParam String password,Model m ) {
		if ("admin".equals(username)&& "admin".equals(password)) {
			
			    List<Student>stu =seo.showall();
			m.addAttribute("data", stu);
				
				return "success";
			}
		else 
		{
		List<Student>stuu=seo.showone(username,password);	
		if(!stuu.isEmpty()) {
			
			m.addAttribute("data", stuu);
			
			return "success";
		}
		else {
		
		
			return "login";
		}
		}
		}
		
	@RequestMapping(value = "/delete")
	public String delete(@RequestParam int sid,Model m) {
		seo.delete(sid);
		
		   List<Student> stu=seo.showall();
		   m.addAttribute("data", stu);
		
		return "success";
	}
	
	@RequestMapping(value = "/edit")
	public String edit(@RequestParam int sid,Model m) {
	Student stu	=seo.edit(sid);
		m.addAttribute("b", stu);
		return "edit";
	}
	
	@RequestMapping(value ="/siso")
	public String update(@ModelAttribute Student ss,Model m) {
	  seo.savedata(ss);
	List<Student>syi=seo.showall();
		
	m.addAttribute("data", syi);
		
		return "success";
		
	}
	
	
	
	}
	

