package com.client.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cloudentity.model.Users;


public class UsersDao extends BaseDao{

	/*@Autowired  
    private JdbcTemplate jdbcTemplate;
	
	public List<Users> queryUsersForList(){
		
		String sql = "select id,username,oassword,salt,description form users where ";
		
		return null;
	}
	
	public Users queryUsers(int id) {
		
		String sql = "select id,username,oassword,salt,description form users where id =? ";
		Users users = jdbcTemplate.queryForObject(sql, new Object[] {id},new RowMapper<Users>() {

			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users users = new Users();
				users.setId(rs.getInt("id"));
				users.setUsername(rs.getString("username"));
				return users;
			}});
		return users;
	}*/
	
}
