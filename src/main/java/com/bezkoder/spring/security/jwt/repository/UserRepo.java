package com.bezkoder.spring.security.jwt.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.jwt.models.Users;


@Repository
public class UserRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Users> getAllUsers() {
		String sql = "select ID_USER_KEY, TX_USER_NAME, TX_USER_FUL_NAME, TX_USER_EMAIL, TX_USER_MOBILE from t_user order by ID_USER_KEY ASC";
		List <Users> userData = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Users.class));
		return userData;
	}

}
