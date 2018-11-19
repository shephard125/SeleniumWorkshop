/**
 * 
 */
package com.library.assets.dao;

import java.util.List;

import com.library.assets.model.Guest;

/**
 * @author Luis A Laya Delgado
 *
 */
public interface LibraryDAOService {
	   public void findById(Guest user);
	
	    public void findByName(Guest user);
		
		public void saveUser(Guest user);
		
		public void updateUser(Guest user);
		
		public void deleteUserById(Guest user);

		public List<Guest> findAllUsers(); 
		
		public void deleteAllUsers();
		
		public void isUserExist(Guest user);

}
