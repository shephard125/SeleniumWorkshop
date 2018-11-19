package com.library.assets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.library.assets.model.Guest;
@Service("LibraryDAOService")
@Repository
public class LibraryDAO implements LibraryDAOService {


	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	 
	 @Autowired
	 public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	  this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	 }
	 
	@Override
	public void findById(Guest user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void findByName(Guest user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveUser(Guest user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(Guest user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserById(Guest user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Guest> findAllUsers() {
		 List<Guest> list = new ArrayList<Guest>();
		  
		  String sql = "SELECT COMPANY_USER_ID, FIRST_NAME, LAST_NAME, address FROM company_user";
		  
		  list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null), new UserMapper());
		  
		  return list;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void isUserExist(Guest user) {
		// TODO Auto-generated method stub
		
	}
	
	
	private SqlParameterSource getSqlParameterByModel(Guest user){
		  MapSqlParameterSource parameterSource = new MapSqlParameterSource();
		  if(user != null){
		   parameterSource.addValue("COMPANY_USER_ID", user.getId());
		   parameterSource.addValue("FIRST_NAME", user.getFirstname());
		   parameterSource.addValue("LAST_NAME", user.getLastname());
		   parameterSource.addValue("address", user.getAddress());
		  }
		  return parameterSource;
		 }
		 
		 private static final class UserMapper implements RowMapper<Guest>{

		  public Guest mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Guest user = new Guest();
		   user.setId(rs.getInt("COMPANY_USER_ID"));
		   user.setFirstname(rs.getString("FIRST_NAME"));
		   user.setLastname(rs.getString("LAST_NAME"));
		   user.setAddress(rs.getString("address"));
		   
		   return user;
		  }

		 }


}
