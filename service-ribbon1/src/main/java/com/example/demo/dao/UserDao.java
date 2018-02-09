package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.pojo.User;

@Repository
@Transactional
public class UserDao {

	@Autowired  
    private JdbcTemplate jdbcTemplate;
	
	@Transactional(readOnly = true)  
    public List<User> findAll() {  
        return jdbcTemplate.query("select id,username,password,salt,description from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				return user;
			}
        });  
    }
	
	
	public int insertUser(User user) {
		String sql = " insert into user(username,password,salt,description) values(?,?,?,?) ";
		return jdbcTemplate.update(sql, user.getUsername(),user.getPassword(),user.getSalt(),user.getDescription());
	}
	
	@Transactional(readOnly = true)
	public User findUsersById(String id) {
		String sql = " select id,username,password,salt,locked,description from user where id =? ";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {

				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setUsername(rs.getString("password"));
				return user;
			}
        });
	}
}
