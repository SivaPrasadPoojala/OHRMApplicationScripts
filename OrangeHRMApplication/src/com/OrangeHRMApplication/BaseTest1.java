package com.OrangeHRMApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest1 
{
	

	WebDriver driver;
	String appUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login/";
	
	@BeforeTest
	public void applicationLaunch()
	{
	
	System.setProperty( "webdriver.chrome.driver" , "./DriverBrowserFiles/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(appUrl);
	
	System.out.println("****Successfully Navigated to Bing Home Page*********");
	}
	
	/*@Test
	public void hello()
	{	
	System.out.println();
	}*/
	
	
	
	/*
	 @AfterTest
	 
	public void applicationclose() throws Exception
	{
	Thread.sleep(2000);	
	driver.close();
	
	System.out.println("****Application Closed Successfully*****");
		
	}
	
	*/
	
			

}
