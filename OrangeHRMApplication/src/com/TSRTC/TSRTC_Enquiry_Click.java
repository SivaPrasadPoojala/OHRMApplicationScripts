package com.TSRTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Enquiry_Click 
{
	
	public static void main(String[] args) {

		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

		By enquiryProperty=By.linkText("Enquiry");
		WebElement enquiry=driver.findElement(enquiryProperty);

		enquiry.click();

		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);

		}

}
