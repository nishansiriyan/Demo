package JDBC;

import org.apache.commons.dbcp2.BasicDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConnectionPooling {
		private static BasicDataSource ds = new BasicDataSource();
		private static final String DB_USERNAME = "username";
		private static final String DB_PASSWORD = "password";
		private static final String DB_URL = "url";
		private static final String DB_DRIVER_CLASS = "driver";
		
		private static Properties properties = null;
		private static BasicDataSource dataSource; 
		
		static {
			try {
				properties = new Properties();
				properties.load(new FileInputStream("src/DatabaseConnection.properties"));
				dataSource = new BasicDataSource();
				dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
		        dataSource.setUrl(properties.getProperty(DB_URL));
		        dataSource.setUsername(properties.getProperty(DB_USERNAME));
		        dataSource.setPassword(properties.getProperty(DB_PASSWORD));
		 
		        dataSource.setMinIdle(5);
		        dataSource.setMaxIdle(10);
		        dataSource.setMaxTotal(25);
		        
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public static BasicDataSource getDataSource() {
			return dataSource;
		}
			
	}

