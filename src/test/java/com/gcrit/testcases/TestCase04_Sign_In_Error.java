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
public class TestCase04_Sign_In_Error extends PageFactoryClass {

	public static Logger log= Logger.getLogger("devpinoyLogger");
	AppPropertyUtil appProperties= new AppPropertyUtil();
	
	@Test(priority=4, description="Sign in with invalid email id")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifying Sign in with ivalid email id")
	@Story("To check Sign in with ivalid email id")
	public void SignIn_Error()
	{
		log.debug("EXECUTING TEST CASE- Sign in with invalid email id");
		SignInPage().click_my_account_link().get_InvalidEmail_id(appProperties.getSignIn_ErrorUsername()).get_InvalidPassword(appProperties.getSignIn_ErrorPassword()).click_sign_in().click_changeMyAccount();
		String actual_error_msg=SignInPage().assert_signin_error();
		String expected_error_msg=" Error: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actual_error_msg, expected_error_msg);
		
	
	}
}
