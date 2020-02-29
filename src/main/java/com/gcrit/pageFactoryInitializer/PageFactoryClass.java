package com.gcrit.pageFactoryInitializer;



import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.gcrit.pageObjectModel.RegistrationPageObject;
import com.gcrit.pageObjectModel.SignIn_PageObject;
import com.gcrit.utility.CommonMethods;


public class PageFactoryClass extends CommonMethods {
	
	public static Logger log= Logger.getLogger("devpinoyLogger");

	public RegistrationPageObject  RegistrationPage()
	{
		log.debug("INITIALIZING REGISTRATION PAGE FACTORY CLASS");
		return PageFactory.initElements(driver, RegistrationPageObject.class);
	}
	
	public SignIn_PageObject  SignInPage()
	{
		log.debug("INITIALIZING LOGIN PAGE FACTORY CLASS");
		return PageFactory.initElements(driver, SignIn_PageObject.class);
	}
}
