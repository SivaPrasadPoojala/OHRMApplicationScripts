package com.TSRTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTC_BaseTest 
{
	

	WebDriver driver;
	String appUrl="http://tsrtc.com";
	
	@BeforeTest
	public void applicationLaunch()
	{
	
	System.setProperty( "webdriver.chrome.driver" , "./DriverBrowserFiles/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(appUrl);
	
	System.out.println("****Successfully Navigated to Bing Home Page*********");
	}
	
	@Test
	public void hello()
	{
		
		System.out.println();
	}
	
	
	
	@AfterTest
	public void applicationclose() throws Exception
	{
	Thread.sleep(2000);	
	driver.close();
	
	System.out.println("****Application Closed Successfully*****");
		
	}
	
			

}
