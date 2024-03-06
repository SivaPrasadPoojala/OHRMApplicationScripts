package com.OHRMAppl_Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Log;

public class OrangHRMApplication_LogInTest_Log extends BaseTest2_Log

{
	
	FileInputStream propertiesFile;
	Properties properties;
	WebDriver driver;

	@Test(priority=1,description=" Validating OrangeHRM Application LogIn Page ")
	public void OrangeHRMApplicationLogInPageValidationTest() throws IOException
	{

	propertiesFile= new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

	properties = new Properties();

	properties.load(propertiesFile);
	
	
	

 
	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM"; // title should be OrangeHRM
	// System.out.println(" The Expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

	Log.info(" The Expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationWebPageTitle=driver.getTitle();
	//System.out.println(" The Actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationWebPageTitle);

	Log.info(" The Actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationWebPageTitle);



	if(actual_OrangeHRMApplicationWebPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	// System.out.println(" Title of the OrangeHRM Application LogIN Page Matched - PASS ");
	Log.info(" Title of the OrangeHRM Application LogIN Page Matched - PASS ");
	}
	else
	{
	// System.out.println(" Title of the OrangeHRM Application LogIN Page NOT Matched - Fail ");
	Log.info(" Title of the OrangeHRM Application LogIN Page NOT Matched - Fail ");
	}

	 
	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
 
	Log.info(" The expected Text of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

 	By LogInPageLogInPanelTextProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
	WebElement logInPageLogInPanelTxt=driver.findElement(LogInPageLogInPanelTextProperty);
	String actual__OrangeHRMApplicationLogInPageText=logInPageLogInPanelTxt.getText();

 	Log.info(" The expected Text of OrangeHRM Application LogIn Page is :- "+actual__OrangeHRMApplicationLogInPageText);

	if(actual__OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
 	Log.info(" ********* Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
 	Log.info(" *********Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
	}
	
	}

}


	