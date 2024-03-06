package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@Test(priority=5)
	public void GmailSentMailTest()
	{
	System.out.println(" Gmail SentMail Functionality Test Successful ");
	}

	@Test(priority=1)
	public void gmailLogInTest()
	{
	System.out.println(" Gmail LogIn Functionality Test Successful ");
	}

	@Test(priority=2)
	public void GmailInBoxTest()
	{
	System.out.println(" Gmail InBox Functionality Test Successful ");
	}

	@Test(priority=3)
	public void gmailComposeMailTest()
	{
	System.out.println(" Gmail ComposeMail Functionality Test Successful ");
	}

	@Test(enabled=false) // This is a false Test Case - TestNG during the Test Run- the current
	                    //    Test case will be Ignored and the rest of the Test Cases will Run
	                     // * The default Status of the Test case is "enabled=true"
	public void GmaildraftsMailTest()
	{
	System.out.println(" Gmail DraftsMail Functionality Test Successful ");
	}



	@AfterMethod
	public void gmailApplicationClose()
	{
	System.out.println(" ******* Gmail Application Closed Successfully ******** ");
	}

	@BeforeMethod
	public void gmailApplicationLaunch() // Test Case Name
	{
	System.out.println(" **** Gmail Application Launched Successfully *******");
	}


}
