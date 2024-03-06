package com.TSRTC_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TSRTC_HomeLink_Screenshot extends BaseTest1
{
	@Test(priority=1, description="capturedScreenshotHomeLink")
	public void HomeLink_Screenshot() throws IOException, InterruptedException 
	{
		/*WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//    Home</a>    */
		
		
		
		By homeProperty=By.linkText("Home");
		WebElement home=driver.findElement(homeProperty);

		home.click();
		
		Thread.sleep(1000) ;
		
		File capturedScreenshotHomeLink=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(capturedScreenshotHomeLink, new File("./TSRTC_ScreenShots/TSRTCHomePageScreenshot0.png"));
		
		
		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);
		
		 
		System.out.println("*** Bing HomePage ScreenShot Captured and Saved to the Project *****");
	}

		
		
		
	}


