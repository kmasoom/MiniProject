package com.gcrit.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.gcrit.utility.AppPropertyUtil;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	AppPropertyUtil appProperty = new AppPropertyUtil();
	public static Logger log= Logger.getLogger("devpinoyLogger");
	
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	@BeforeTest
	public void setUp() throws InterruptedException {
	
		
		log.debug("LAUNCING BROWSER");
		if ((appProperty.getBrowser()).equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}

		else if ((appProperty.getBrowser()).equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}

		else if ((appProperty.getBrowser()).equalsIgnoreCase("ie"))

		{
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}

		else {
			System.out.println("Please provide valid browser");
		}

		driver.manage().window().maximize();
		driver.get(appProperty.getUrl());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	@AfterTest
	public void tearDown()

	{
		if(driver!=null)
			log.debug("CLOSING BROWSER");
			driver.quit();
	}
}
