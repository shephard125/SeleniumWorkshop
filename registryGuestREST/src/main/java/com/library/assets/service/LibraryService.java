package com.library.assets.service;

import java.util.List;



import com.library.assets.model.Guest;

public interface LibraryService {
	
	public void deleteAllUsers();
	
	public void isUserExist(Guest user);
	public void findById(Guest user);
		
	public void findByName(Guest user);
	
	public void saveUser(Guest user);
	
	public void updateUser(Guest user);
	
	public void deleteUserById(Guest user);
	
	public List<Guest> findAllUsers(); 
	
	

}
