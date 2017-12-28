package com.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;


public class DataBaseConfiguration {

	/*@Bean(destroyMethod = "close", initMethod = "init")  
    @ConfigurationProperties("spring.datasource")  
    public com.alibaba.druid.pool.DruidDataSource dataSource() {  
  
        System.out.println("注入druid！！！");  
        DruidDataSource druidDataSource = new DruidDataSource();  
        return druidDataSource;  
    }*/
}
