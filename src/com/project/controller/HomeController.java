package com.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.project.module.Employee;
import com.project.tester.PropertyFileTester;  
@Controller  
public class HomeController {
	@Autowired
	Employee employee;
	final static Logger logger = Logger.getLogger(HomeController.class);
	PropertyFileTester prop=new PropertyFileTester("E://roechar//Project//SpringTesting//WebContent//WEB-INF//properties//empl.properties");
	 @RequestMapping("/hello")  
	    public ModelAndView helloWorld() {  
	        String message = "HELLO SPRING MVC HOW R U";  
	        logger.info("I am working");
	        System.out.println("Employee name:"+employee.getName());
	        logger.info("property"+prop.getPropertyByName("emp.name"));
	        return new ModelAndView("hellopage", "message", message);  
	    }  
}
