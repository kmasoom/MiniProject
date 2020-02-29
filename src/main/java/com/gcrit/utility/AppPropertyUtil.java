package com.gcrit.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;



public class AppPropertyUtil {

	public static Properties prop;
	public static Logger log= Logger.getLogger("devpinoyLogger");


	public AppPropertyUtil(){
		try {
		prop = new Properties();
		FileInputStream s = new FileInputStream("C:\\Users\\kumarim\\eclipse-workspace\\Automation_MiniProject\\src\\test\\resources\\config.properties");
		prop.load(s);
		log.debug("LOADING PROPERTY FILE");
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}

	   
	      

	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getUrl() {
		return prop.getProperty("url");
	}
	
	public String getGender() {
		
		return prop.getProperty("gender");
		
	}

	public String getDob() {
		
		return prop.getProperty("dob");
		
	}
	
	public String getFirstName() {
		return prop.getProperty("first_name");
	}

	public String getLastName() {
		return prop.getProperty("last_name");
	}

	public String getPhone() {
		return prop.getProperty("phone");
	}

	public String getEmail() {
		return prop.getProperty("email");
	}
	
	public String getErrorEmail() {
		return prop.getProperty("error_email");
	}
	
	public String getAdress() {
		return prop.getProperty("address");
	}
	public String getCity() {
		return prop.getProperty("city");
	}

	public String getState() {
		return prop.getProperty("state");
	}
	public String getCode() {
		return prop.getProperty("code");
	}
	public String getCountry() {
		return prop.getProperty("country");
	}
	public String getUsername() {
		return prop.getProperty("username");
	}
	public String getpassword() {
		return prop.getProperty("password");
	}
	public String getConfirmPassword() {
		return prop.getProperty("confirm_password");
	}
		public String getSignInUsername() {
			return prop.getProperty("signin_username");
	}
		public String getSignInPassword() {
			return prop.getProperty("signin_password");
	}
		
		public String getSignIn_ErrorUsername() {
			return prop.getProperty("signin_invalid_username");
	}
		public String getSignIn_ErrorPassword() {
			return prop.getProperty("signin_invalid_password");
	}
	
}
