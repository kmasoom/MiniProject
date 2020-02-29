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
public class TestCase03_Sign_In extends PageFactoryClass {
	
	public static Logger log= Logger.getLogger("devpinoyLogger");
	AppPropertyUtil appProperties= new AppPropertyUtil();

	@Test(priority=2, description="Sign in with valid email id")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verifying Sign in with valid email id")
	@Story("To check Sign in with valid email id")
	public void SignIn()
	{
		log.debug("EXECUTING TEST CASE- Sign in with valid email id");
		SignInPage().click_my_account_link().get_email_id(appProperties.getSignInUsername()).get_password(appProperties.getSignInPassword()).click_sign_in();
		//.click_changeMyAccount()
		
	
		Assert.assertTrue((SignInPage().changeMyAccount_button()).isDisplayed());
		SignInPage().click_changeMyAccount();
		String actual_email=SignInPage().assert_signin_check();
		String expected_email=appProperties.getSignInUsername();
		Assert.assertEquals(actual_email, expected_email);
		
	
	}
}
