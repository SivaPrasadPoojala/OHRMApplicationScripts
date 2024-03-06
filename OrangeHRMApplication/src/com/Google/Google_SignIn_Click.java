package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ChromeDriver chromeBrowser;
		WebDriver driver; // WebDriver is an interface of Selenium

		String applicationUrlAddress="http://google.com";

		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		/*
		<a  aria-label="Sign in"
		href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		continue=https://www.google.com/&amp;ec=GAZAmgQ"
		target="_top"><span >Sign in</span></a>

		 < - tag

		 a - an anchor Tag
		 href- attribute

		  The Type of Element is - link
		 
		 locator - linkText
		 selector - Sign in
		*/

		//By signInProperty=By.linkText("Sign in"); // should be given with complete text of the Link as a selector
		//WebElement signIn=driver.findElement(signInProperty);
		//signIn.click();

		By signInProperty=By.partialLinkText("Sign"); // need to be provided with part of the text of the links as a selector
		WebElement signIn=driver.findElement(signInProperty);
		signIn.click();



	}

}
