package com.springtest.front.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtest.front.demo.model.EMP;
import com.springtest.front.demo.service.EmpService;

@Controller
public class MainController {
    @Autowired
    private EmpService empService;
    
   @RequestMapping(value = "/list")
   public String listUser(Model model) {
	  
	   try {
		   List<EMP> listEmp = empService.getEmp("0001");
		   model.addAttribute("users", listEmp);
		 
	   } catch (Exception ex) {
		   System.out.println(ex.getMessage());
	   }
	  
      return "main";
   }
}
