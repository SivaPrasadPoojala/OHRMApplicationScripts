package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//ChromeDriver chromeBrowser;
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in";


		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);


		// <a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders"
		//class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>

		// <a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>

		Thread.sleep(10000);

		By yourOrdersProperty=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrdersProperty);
		yourOrders.click();

	}
	        

}
