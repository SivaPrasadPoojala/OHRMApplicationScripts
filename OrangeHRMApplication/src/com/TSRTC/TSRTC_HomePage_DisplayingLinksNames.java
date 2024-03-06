package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_DisplayingLinksNames 
{
	
	public static void main(String[] args) {

		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		System.setProperty("webdriver.chrome.driver", "./DriverBrowserFiles/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get(applicationUrlAddress);


		/*
		<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
		<a href="#" onclick="populateSearch('21101', 'Chennai', '5231', 'Hyderabad');"> Chennai - Hyderabad</a>

		<input type="text" name="toPlaceName" size="22" value="" onblur="setHelpText('Enter To City Name', 'toPlaceName');" onfocus="clearHelpText('Enter To City Name', 'toPlaceName');" id="toPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
		<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">


		*/

		// in the above inspected Elements Properties - we see a common property to work on the
//		    links of the Webpage is - anchor tag (a)

		By linksProperty=By.tagName("a");
		List<WebElement>tsrtc_HomePagelinks=driver.findElements(linksProperty);

		int tsrtc_HomePageLinksCount=tsrtc_HomePagelinks.size();
		System.out.println("The number of links on the TSRTC Application Home Page are :- "+tsrtc_HomePageLinksCount);


		for(int index=0;index<tsrtc_HomePageLinksCount;index++)
		{

		String tsrtc_HomePage_LinkName=tsrtc_HomePagelinks.get(index).getText();
		System.out.println(index+" - "+ tsrtc_HomePage_LinkName);

		}
		

driver.quit();
}



}
