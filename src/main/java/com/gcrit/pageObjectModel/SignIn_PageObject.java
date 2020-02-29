package com.gcrit.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gcrit.utility.CommonMethods;

import io.qameta.allure.Step;

public class SignIn_PageObject {
	
	CommonMethods method= new CommonMethods();
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement my_account_link;
	
	@FindBy(xpath="//input[@name='email_address']")
	WebElement email_id;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	WebElement sign_in_button;

	
	@FindBy(xpath="//a[contains(text(),'View or change my account information.')]")
	WebElement changeMyAccount;
	
	@FindBy(xpath="//input[@name='email_address']")
	WebElement assert_signin;
	
	@FindBy(xpath="//td[@class='messageStackError']")
	WebElement assert_error_signin;
	
	@Step("Clicking on My Account link for Sign in user")
	public SignIn_PageObject click_my_account_link()
	{
		method.clickMethod(my_account_link);
		return this;
	}
	
	@Step("Entering email id: {0} for sign in")
	public SignIn_PageObject get_email_id(String e_id)
	{
		method.sendKeysMethod(email_id, e_id);
		return this;
	}
	
	@Step("Entering Password for sign in")
	public SignIn_PageObject get_password(String passkey)
	{
		method.sendKeysMethod(password, passkey);
		return this;
	}
	
	
	
	@Step("Entering invalid email id: {0} for sign in")
	public SignIn_PageObject get_InvalidEmail_id(String e_id)
	{
		method.sendKeysMethod(email_id, e_id);
		return this;
	}
	
	@Step("Entering invalid Password: {0} for sign in")
	public SignIn_PageObject get_InvalidPassword(String passkey)
	{
		method.sendKeysMethod(password, passkey);
		return this;
	}
	

	@Step("Clicking on Sign in button")
	public SignIn_PageObject click_sign_in()
	{
		method.clickMethod(sign_in_button);
		return this;
	}
	
	@Step("Clicking on Change My Account")
	public SignIn_PageObject click_changeMyAccount()
	{
		method.clickMethod(changeMyAccount);
		return this;
	}
	
	@Step("Checking success sign in by fetching email id after sign in")
	public String assert_signin_check()
	{
		return assert_signin.getAttribute("value");
		}
	
	@Step("Checking proper error message after invalid sign in")
	public String assert_signin_error()
	{
		return assert_error_signin.getText();
		}
	
	public WebElement changeMyAccount_button() {
		return changeMyAccount;
	}
	
}
