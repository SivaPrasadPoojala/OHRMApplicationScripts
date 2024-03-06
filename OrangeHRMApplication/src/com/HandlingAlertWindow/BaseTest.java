package com.HandlingAlertWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" *********  Chrome Browser Launched Successfully ********");

	driver.get(applicationUrlAddress);

	System.out.println(" Navigated to TSRTC Application WebPage");
	}

	public void applicationClose()
	{
	driver.quit();
	System.out.println("******** Chome Browser Closed Successfully *******");
	}
}
