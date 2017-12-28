package com.client.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cloudentity.model.Users;

@Repository
public class UsersRepository {

	@Autowired  
    private JdbcTemplate jdbcTemplate;
	
	@Transactional(readOnly = true)  
    public List<Users> findAll() {  
        return jdbcTemplate.query("select id,username,password,salt,description from users", new RowMapper<Users>() {
			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users users = new Users();
				users.setId(rs.getInt("id"));
				users.setUsername(rs.getString("username"));
				return users;
			}
        });  
    }
	
	@Transactional(readOnly = true)
	public Users findUsersById(String id) {
		String sql = " select id,username,password,salt,locked,description from users where id =? ";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<Users>() {
			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users users = new Users();
				users.setId(rs.getInt("id"));
				users.setUsername(rs.getString("username"));
				users.setUsername(rs.getString("password"));
				return users;
			}
        });
	}
}
