package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static Properties property;
	private static String configpath = "C:\\Users\\lenovo\\eclipse-workspace\\demoqa.bookstore\\src\\test\\resources\\configFile\\config.properties";
	
	
	public static void initializePropertyFile() {
		
		property = new Properties();
		try {
			InputStream instm = new FileInputStream(configpath);
			property.load(instm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static String getBrowser() {
		initializePropertyFile();
		return property.getProperty("browser");
	}


	public static String getAppUrl() {
		initializePropertyFile();
		return property.getProperty("appUrl");
	}

	public static String getUsername() {
		initializePropertyFile();
		return property.getProperty("username");
	}
	
	public static String getPassword() {
		initializePropertyFile();
		return property.getProperty("password");

	}
	
	public static String getFirstName() {
		initializePropertyFile();
		return property.getProperty("firstName");
	}

	public static String getLastName() {
		initializePropertyFile();
		return property.getProperty("lastName");
	}

	public static String getDriverPath() {
		initializePropertyFile();
		return property.getProperty("driverPath");
	}
}

