package com.client.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

//@Component
public class BaseDao {

	/*@Autowired  
    private JdbcTemplate jdbcTemplate;
	
	public <T> List<T> queryForList(String sql,Object[] objs,RowMapper<T> rowMapper){
		return jdbcTemplate.query(sql, objs,rowMapper);
	}*/
	
}
