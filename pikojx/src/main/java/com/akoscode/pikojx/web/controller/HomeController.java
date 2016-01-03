package com.akoscode.pikojx.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akoscode.pikojx.model.Contact;
import com.akoscode.pikojx.service.ContactService;

@Controller
public class HomeController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value = "/getlist")
	public ModelAndView getList() {
		ModelAndView mav = new ModelAndView("list");
		List<Contact> listContact = contactService.getList();
		mav.addObject("list", listContact);
		return mav;
	}
}
