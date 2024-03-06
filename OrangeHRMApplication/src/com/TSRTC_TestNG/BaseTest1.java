package com.TSRTC_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest1 
{
	

	WebDriver driver;
	String appUrl="https://www.tsrtconline.in/oprs-web/";
	
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
	
	
	
	@AfterTest
	public void applicationclose() throws Exception
	{
	Thread.sleep(2000);	
	driver.close();
	
	System.out.println("****Application Closed Successfully*****");
		
	}
	
			

}
