package com.akoscode.pikojx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akoscode.pikojx.dao.ContactDAO;
import com.akoscode.pikojx.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactDAO contactDao;
	
	public List<Contact> getList() {
		return contactDao.selectAll();
	}
}
