package com.gcrit.utility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.gcrit.base.TestBase;

public class CommonMethods extends TestBase {
	
	public void sendKeysMethod(WebElement element, String value) {
		try {
		element.sendKeys(value);
		} catch (Exception e) {

		}
		}

		public boolean clickMethod(WebElement element) {
		try {
		element.click();
		return true;
		} catch (Exception e) {

		}
		return false;
		}
		
		public boolean isElementPresent(By by)
		{
			try {
				driver.findElement(by);
				return true;
			}
			catch(NoSuchElementException e){
				return false;
			}
			
		}

}
