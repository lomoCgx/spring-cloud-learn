package com.client;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
	}
	
	/*@Autowired  
    private Environment env;  
  
    @Bean  
    public DruidDataSource dataSource() {  
        DruidDataSource dataSource = new DruidDataSource();  
        dataSource.setUrl(env.getProperty("spring.datasource.url"));  
        dataSource.setUsername(env.getProperty("spring.datasource.username"));//用户名  
        dataSource.setPassword(env.getProperty("spring.datasource.password"));//密码  
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));  
        dataSource.setInitialSize(2);  
        dataSource.setMaxActive(20);  
        dataSource.setMinIdle(0);  
        dataSource.setMaxWait(60000);  
        dataSource.setValidationQuery("SELECT 1");  
        dataSource.setTestOnBorrow(false);  
        dataSource.setTestWhileIdle(true);  
        dataSource.setPoolPreparedStatements(false);  
        return dataSource;  
    }*/
}
