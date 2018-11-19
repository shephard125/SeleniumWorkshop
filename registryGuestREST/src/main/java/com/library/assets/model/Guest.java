package com.library.assets.model;

import java.io.Serializable;

public class Guest implements Serializable {

	/**
	 * @param id
	 * @param firstname
	 * @param lastname
	 * @param address
	 */
	public Guest() {
		super();
	}
	public Guest(Integer l, String firstname, String lastname, String address) {
		super();
		this.id = l;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private Integer id;
	 private String firstname;
	 private String lastname;
	 private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
