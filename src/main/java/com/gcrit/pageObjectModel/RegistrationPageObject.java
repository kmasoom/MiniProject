package com.gcrit.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gcrit.utility.CommonMethods;

import io.qameta.allure.Step;

public class RegistrationPageObject {
	
	CommonMethods method= new CommonMethods();
	
	@FindBy(xpath="//u[contains(text(),'create an account')]")
	WebElement create_account;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender_male;
	
	@FindBy(xpath="//input[@value='f']")
	WebElement gender_female;
	
	@FindBy(xpath="//input[@name=\'firstname\']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name=\'lastname\']")
	WebElement last_name;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(xpath="//input[@name=\'telephone\']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name=\'email_address\']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@name=\'street_address\']")
	WebElement address;
	
	@FindBy(xpath="//input[@name=\'city\']")
	WebElement city;
	
	@FindBy(xpath="//input[@name=\'state\']")
	WebElement state;
	
	@FindBy(xpath="//input[@name=\'postcode\']")
	WebElement code;
	
	@FindBy(xpath="//select[@name=\'country\']")
	WebElement country;
	
	
	@FindBy(xpath="//input[@name=\'password\']")
	WebElement password;
	
	@FindBy(xpath="//input[@name=\'confirmation\']")
	WebElement confirm_password;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continue_button;
	
	@FindBy(xpath="//div[@id='bodyContent']//h1")
	WebElement SuccessAssert_msg;
	
	@Step("Clicking on Create Account button")
	public RegistrationPageObject reg_create_account()
	{
		method.clickMethod(create_account);
		return this;
	}
	
	@Step("Selecting gender")
	public RegistrationPageObject reg_gender(String gender)
	{
	if(gender.equals("male"))
		method.clickMethod(gender_male);
	else
		method.clickMethod(gender_female);
	return this;
	}
	
	@Step("Entering First name")
	public RegistrationPageObject reg_first_name(String fname)
	{
		method.sendKeysMethod(first_name, fname);
		return this;
	}
	
	@Step("Entering Last name")
	public RegistrationPageObject reg_last_name(String lname)
	{
		method.sendKeysMethod(last_name, lname);
		return this;
		
	}
	
	@Step("Entering Date of birth")
	public RegistrationPageObject reg_dob(String date_of_birth)
	{
		method.sendKeysMethod(dob, date_of_birth);
		return this;
		
	}

	@Step("Entering Phone number")
	public RegistrationPageObject reg_phone(String phone_no)
	{
		method.sendKeysMethod(phone, phone_no);
		return this;
		
	}
	
	@Step("Entering Email id: {0} for registration")
	public RegistrationPageObject reg_email(String e_mail)
	{
		method.sendKeysMethod(email, e_mail);
		return this;
	
	}
	
	@Step("Entering Invalid Email id: {0}")
	public RegistrationPageObject reg_error_email(String error_email)
	{
		method.sendKeysMethod(email, error_email);
		return this;
	
	}
	
	@Step("Entering Address")
	public RegistrationPageObject reg_address(String adres)
	{
		method.sendKeysMethod(address, adres);
		return this;
		
	}
	@Step("Entering City name")
	public RegistrationPageObject reg_city(String city_name)
	{
		method.sendKeysMethod(city, city_name);
		return this;
		
	}
	
	@Step("Entering State name")
	public RegistrationPageObject reg_state(String state_name)
	{
		method.sendKeysMethod(state, state_name);
		return this;
	
	}
	
	@Step("Entering postal code")
	public RegistrationPageObject reg_code(String code_name)
	{
		method.sendKeysMethod(code, code_name);
		return this;
	
	}
	
	@Step("Entering country name")
	public RegistrationPageObject reg_country(String country_name)
	{
		method.sendKeysMethod(country, country_name);
		return this;
		
	}
	
	@Step("Entering Password for registration")
	public RegistrationPageObject reg_password(String passkey)
	{
		method.sendKeysMethod(password, passkey);
		return this;
		
	}
	
	@Step("Entering confirm Password for registration")
	public RegistrationPageObject reg_confrim_password(String confirm_passkey)
	{
		method.sendKeysMethod(confirm_password, confirm_passkey);
		return this;
		
	}
	
	@Step("Clicking on submit button")
	 public RegistrationPageObject submit_button()
	 {
		 method.clickMethod(continue_button);
		 return this;
	 }
	
	@Step("Asserting the registration form")
		public String reg_successAssertMsg()
		{
			return SuccessAssert_msg.getText();
		}
		

}
