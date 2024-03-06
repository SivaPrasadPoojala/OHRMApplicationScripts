package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_LinksTesting 
{
	
	public static void main(String[] args) {

		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		// <a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		// <a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>

		// Identify the Header Block the WebPage
		// class="menu-wrap" -

		By tsrtc_HomePageHeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HomePageHeaderBlock=driver.findElement(tsrtc_HomePageHeaderBlockProperty);


		By tsrtc_HomePageHeaderBlockElementsProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePageHeaderBlockLinks=tsrtc_HomePageHeaderBlock.findElements(tsrtc_HomePageHeaderBlockElementsProperty);

		int tsrtc_HeaderBlockLinksCount=tsrtc_HomePageHeaderBlockLinks.size();
		System.out.println(" The Number of links in the Header Block of TSRTC Application HomePage are :- "+tsrtc_HeaderBlockLinksCount);


		for(int index=0;index<tsrtc_HeaderBlockLinksCount;index++)
		{
		String tsrtc_HeaderBlockLinkName=tsrtc_HomePageHeaderBlockLinks.get(index).getText();
		System.out.println(index+" - "+tsrtc_HeaderBlockLinkName);

		tsrtc_HomePageHeaderBlockLinks.get(index).click();

		// WebPage will be moved to the next corresponding Page

		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);
		

		String actual_webPageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(actual_webPageCurrentUrlAddress);

		System.out.println();

		// Driver should be re-directed to the previous WebPage

		driver.navigate().back();

		// Identifying the Header Block again

		tsrtc_HomePageHeaderBlock=driver.findElement(tsrtc_HomePageHeaderBlockProperty);
		// Identifying the elements of the Header block and storing in the arrayList Back

		tsrtc_HomePageHeaderBlockLinks=tsrtc_HomePageHeaderBlock.findElements(tsrtc_HomePageHeaderBlockElementsProperty);
		}

		driver.quit();


		}


}
