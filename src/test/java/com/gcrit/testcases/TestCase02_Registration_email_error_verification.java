package com.gcrit.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.gcrit.listener.TestAllureListener;
import com.gcrit.pageFactoryInitializer.PageFactoryClass;
import com.gcrit.utility.AppPropertyUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners({TestAllureListener.class})
public class TestCase02_Registration_email_error_verification extends PageFactoryClass
{
	
	public static Logger log= Logger.getLogger("devpinoyLogger");
	AppPropertyUtil appProperties= new AppPropertyUtil();
	
	
	@Test(priority=3, description="Registration with invalid email id")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifying Registration page with invalid email id")
	@Story("To check Registration page with invalid email id")
	public void Registration_email_error_verification()
	{
		log.debug("EXECUTING TEST CASE- Registration Page with invalid email id");
	
	RegistrationPage().reg_create_account().reg_gender(appProperties.getGender()).reg_first_name(appProperties.getFirstName()).
	reg_last_name(appProperties.getLastName()).reg_dob(appProperties.getDob()).reg_email(appProperties.getErrorEmail()).reg_address(appProperties.getAdress()).reg_code(appProperties.getCode()).
	reg_city(appProperties.getCity()).reg_state(appProperties.getState()).reg_country(appProperties.getCountry()).reg_phone(appProperties.getPhone()).
	reg_password(appProperties.getpassword()).reg_confrim_password(appProperties.getConfirmPassword()).submit_button();
	
	System.out.println("Email id entering is: "+appProperties.getErrorEmail());
	String actual_ErrorMessage=driver.switchTo().alert().getText();
	String expected_ErrorMessage= "Errors have occured during the process of your form.\r\n" + 
			"\r\n" + 
			"Please make the following corrections:\r\n" + 
			"\r\n" + 
			"* Your E-Mail Address must contain a minimum of 6 characters.";
	
	//Assert.assertEquals(actual_ErrorMessage, expected_ErrorMessage);
	System.out.println(actual_ErrorMessage.equals(expected_ErrorMessage));
	}
	
}