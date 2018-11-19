/**
 * 
 */
package com.library.assets.configuration;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Luis A Laya Delgado
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan (basePackages ="com.library.assets")
public class LibraryConfiguration {
	@Autowired
	DataSource ds;
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJDBCTemplate()
	{ return new NamedParameterJdbcTemplate(ds);}
	
	@Bean 
	public DataSource getDatasource() throws NamingException
	{
		JndiTemplate jdnniTemplate = new JndiTemplate();
		DataSource dataSource = (DataSource) jdnniTemplate.lookup("java:comp/env/jdbc/v1");
		return dataSource;
	}

}
