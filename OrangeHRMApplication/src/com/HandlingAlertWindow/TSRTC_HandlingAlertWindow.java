package com.HandlingAlertWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TSRTC_HandlingAlertWindow extends BaseTest {
	
	public void handlingAlert() throws InterruptedException
	{

	// id="searchBtn" - Property of CheckAvailability Button

	By checkAvailabilityButtonPrperty=By.id("searchBtn");
	WebElement checkAvailabilityButton=driver.findElement(checkAvailabilityButtonPrperty);

	checkAvailabilityButton.click();

	// working with the Alert Window

	Alert tsrtcAlertWindow=driver.switchTo().alert();

	String expected_AlertWindowText="Please select start place.";
	System.out.println(" The Actual Alert Window Message is :- "+expected_AlertWindowText);

	// getting the Text of an Alert Window

	String actual_alertWindowMessageText=tsrtcAlertWindow.getText();
	System.out.println(" The Actual Alert Window Message is :- "+actual_alertWindowMessageText);

	if(actual_alertWindowMessageText.equals(expected_AlertWindowText))
	{
	System.out.println(" Successfully interacted with Alert Window - contains a Message - PASS");
	}
	else
	{
	System.out.println(" Successfully interacted with Alert Window - DOES NOT contains a Message - FAIL");
	}

	Thread.sleep(10000);

	tsrtcAlertWindow.accept(); // accept method will work on accepting the OK button

	// Cancel button

	// tsrtcAlertWindow.dismiss(); // dismissed method will work on operation to click Cancel button

	// sending test data into an alert window

	// tsrtcAlertWindow.sendKeys("Test Data");



	}

	public static void main(String[] args) throws InterruptedException
	{

	TSRTC_HandlingAlertWindow handlingAlertWindow = new TSRTC_HandlingAlertWindow();
	handlingAlertWindow.applicationLaunch();

	handlingAlertWindow.handlingAlert();

	handlingAlertWindow.applicationClose();

	}

	//private void applicationClose() {
		// TODO Auto-generated method stub
		
	//}

	//private void applicationLaunch() {
		// TODO Auto-generated method stub
		
	}


