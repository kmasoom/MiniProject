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
public class TestCase01_Regisration extends PageFactoryClass{
	public static Logger log= Logger.getLogger("devpinoyLogger");

	AppPropertyUtil appProperties= new AppPropertyUtil();
	
	
	@Test(priority=1, description="Registering a new user")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verifying Registration page")
	@Story("To check Registering a new user")
	
	
	public void Registraion_Gcrit()
	{
		log.debug("EXECUTING TEST CASE- Registration Page");
		RegistrationPage().reg_create_account().reg_gender(appProperties.getGender()).reg_first_name(appProperties.getFirstName()).
		reg_last_name(appProperties.getLastName()).reg_dob(appProperties.getDob()).reg_email(appProperties.getEmail()).reg_address(appProperties.getAdress()).reg_code(appProperties.getCode()).
		reg_city(appProperties.getCity()).reg_state(appProperties.getState()).reg_country(appProperties.getCountry()).reg_phone(appProperties.getPhone()).
		reg_password(appProperties.getpassword()).reg_confrim_password(appProperties.getConfirmPassword()).submit_button();
		
		String expected_message= "Your Account Has Been Created!";
		Assert.assertEquals(RegistrationPage().reg_successAssertMsg(), expected_message);
		System.out.println(RegistrationPage().reg_successAssertMsg());
		
	}
	
}
