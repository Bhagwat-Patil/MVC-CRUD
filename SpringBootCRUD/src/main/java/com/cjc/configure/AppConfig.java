package com.cjc.configure;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Student;

@Controller
@EnableWebMvc
@ComponentScan(basePackages ="com.cjc")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean
	public DriverManagerDataSource driverManager()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/spring_boot_crud");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean localSession()
	{
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(driverManager());
		
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		sf.setHibernateProperties(p);
		sf.setAnnotatedClasses(Student.class);
		return sf;
	}
}
