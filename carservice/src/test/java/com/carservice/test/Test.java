package com.carservice.test;

import javax.activation.DataSource;
import javax.naming.NamingException;

import org.springframework.context.annotation.Configuration;
import org.springframework.jndi.JndiTemplate;


@Configuration
public class Test {

		    DataSource dataSource() {
		        DataSource dataSource = null;
		        JndiTemplate jndi = new JndiTemplate();
		        try {
		            dataSource = jndi.lookup("java:comp/env/jdbc/yourname", DataSource.class);
		        } catch (NamingException e) {
		            System.err.println("NamingException for java:comp/env/jdbc/yourname" +e);
		        }
		        return dataSource;
		    }

		}
		
	

