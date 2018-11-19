package com.library.assets.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.library.assets.model.Guest;
import com.library.assets.service.LibraryService;



@RestController
public class LibraryController {
	
	@Autowired
	LibraryService libService;
	
	@RequestMapping(value="/user/", method = RequestMethod.GET, headers="Accept=application/json")
	 public ResponseEntity<List<Guest>> listAllUsers(){
		List<Guest> list = libService.findAllUsers();
        if(list.isEmpty()){
            return new ResponseEntity<List<Guest>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Guest>>(list, HttpStatus.OK);
        	//		List<Guest> list = new ArrayList<Guest>();
        //		Guest a= new Guest();
        //		a.setFirstname("Luis");
        //		list.add(a);
	  /*List<Guest> list = libService.findAllUsers();
	  
	  if(list.size() == 0){
	   return new ResponseEntity<List<Guest>>(HttpStatus.NO_CONTENT);
	  }
	  
	  return new ResponseEntity<List<Guest>>(list, HttpStatus.OK);*/
		 
		
	 }
	

}
