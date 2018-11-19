package com.library.assets.service;





import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.assets.dao.LibraryDAOService;
import com.library.assets.model.Guest;
@Service("LibraryService")
@Transactional
public class LibraryServiceImpl implements LibraryService {
	
	LibraryDAOService libDAO;
	@Autowired
	public void setLibDAO(LibraryDAOService libDAO) {
		this.libDAO = libDAO;
	}

	
	public void findById(Guest user) {
		this.libDAO.findAllUsers();
		
	}


	public void findByName(Guest user) {
		this.libDAO.findByName(user);

	}

	
	public void saveUser(Guest user) {
		this.saveUser(user);
		
	}


	public void updateUser(Guest user) {
		this.saveUser(user);
		
	}


	public void deleteUserById(Guest user) {
		this.deleteUserById(user);
		
	}


	

	
	public void deleteAllUsers() {
		this.deleteAllUsers();
		
	}


	public void isUserExist(Guest user) {
		// TODO Auto-generated method stub
		this.libDAO.isUserExist(user);
	}
	
	public List<Guest> findAllUsers() {
		// TODO Auto-generated method stub
		return libDAO.findAllUsers();
		/*List<Guest> a = new ArrayList<Guest>();
		Guest b= new Guest (1,"Luis","Laya","505");
		a.add(b);
		return  a;*/
		
	}
	
	

}
