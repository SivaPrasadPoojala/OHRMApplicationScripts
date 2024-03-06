package com.OHRMAppl_Log;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest2_Log 
{
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony";

	@BeforeTest
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");
	driver = new ChromeDriver();

	// System.out.println(" **** Chrome Browser Launched Successfully *****");

	Log.info("**** Chrome Browser Launched Successfully *****");

	driver.get(applicationUrlAddress);

	// System.out.println(" Navigated to OrangeHRM Application WebPage ");
	Log.info("Navigated to OrangeHRM Application WebPage");

	driver.manage().window().maximize();

	// its a wait time for the WebPage to be loaded on the Browser
	// it will get application for every WebPage to be Loaded on the Navigated Browser
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	// its a Global Wait
	// its a smart wait
	// it should be implemented well on the top of the Script
	// this wait will get applicable for every WebElement need to be identified with the
    //	     given property on the current Navigated Page
	// This will get applicable for every Navigated WebPage related WebEsements individually
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	@AfterTest
	public void applicationClose()
	{
	driver.quit();
	//System.out.println(" **** Chrome Browser along with the Application Closed Successfully ****");
	Log.info(" **** Chrome Browser along with the Application Closed Successfully ****");

	}


}