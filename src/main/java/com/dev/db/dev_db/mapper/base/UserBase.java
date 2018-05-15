package com.dev.db.dev_db.mapper.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;
import com.dev.db.dev_db.mapper.User;

public class UserBase implements RowMapper<User>{
	
	private Long _id;
	
	// Attributes
	private String mail;
	private String name;
	private String password;
	private String roles;
	private String surname;
	private String username;
	
	
	
	
	
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User obj = new User();
		try {
			obj.set_id(rs.getLong("id"));
			
			obj.setMail(rs.getString("mail"));
			obj.setName(rs.getString("name"));
			obj.setPassword(rs.getString("password"));
			obj.setRoles(rs.getString("roles"));
			obj.setSurname(rs.getString("surname"));
			obj.setUsername(rs.getString("username"));
			
        	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}


	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	
    
    
    
    
    
}