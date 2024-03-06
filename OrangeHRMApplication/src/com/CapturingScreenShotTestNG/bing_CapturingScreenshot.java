package com.CapturingScreenShotTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

 
	
	public class bing_CapturingScreenshot extends BaseTest 
	{
		
		@Test
		public void bing_CapturingScreenShot() throws IOException
		{
			File capturedScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(capturedScreenshot, new File("./OHRM_Screenshots/BingHomePageScreenshot0.png"));
			
			
			System.out.println("*** Bing HomePage ScreenShot Captured and Saved to the Project *****");
		}

	}
	
