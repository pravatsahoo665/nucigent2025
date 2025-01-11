package com.example.Boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Boot.domains.StudentManagement;
import com.example.Boot.services.MyService;

@Controller
public class myControllers {
	@Autowired
	public MyService ser;
	
	public myControllers() {
		System.out.println("controller created...");
	}
	
	@GetMapping("/")
	public String welcome() {
		System.out.println("enter to controllers...");
		return"welcome";
		
	}
	@GetMapping("/insert")
	public String insertpage(@ModelAttribute("key")StudentManagement s) {
		System.out.println("enter  to insert data... ");
		return"insertpage";
		
	}
	@PostMapping("/insertdata")
	public String insertdata(@ModelAttribute("key")StudentManagement s) {
		ser.insertdata(s);
		return"redirect:fetch";
	}
	@GetMapping("/fetch")
	public String displayData(Model m) {
		List<StudentManagement>l=ser.fetch();
		m.addAttribute("office", l);
		return"displaypage";
	}
	@GetMapping("/update")
	public String updatepage(@ModelAttribute("key")StudentManagement s) {
		System.out.println("enter  to Update data... ");
		return"updatepage";
		
	}
	@PostMapping("/updatdata")
	public String updatedata(@ModelAttribute("key")StudentManagement s) {
		ser.updatedata(s);
		return"redirect:fetch";
	}
	@GetMapping("/delete")
	public String deletepage(@ModelAttribute("key")StudentManagement s) {
		System.out.println("enter  to delete data... ");
		return"deletepage";
		
	}
	@PostMapping("/deletdata")
	public String deletedata(@ModelAttribute("key")StudentManagement s) {
		ser.deletedata(s);
		return"redirect:fetch";
	}
	

	
	

}
