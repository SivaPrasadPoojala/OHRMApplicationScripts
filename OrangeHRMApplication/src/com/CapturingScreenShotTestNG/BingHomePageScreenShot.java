package com.CapturingScreenShotTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class BingHomePageScreenShot extends BaseTest
{

	

	@Test
	public void bing_CapturingScreenshot() throws IOException
	{
 
		File capturedScreenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(capturedScreenshot1, new File("./OHRM_Screenshots/BingHomePageScreenshot1.png"));
		
		
	}
	
}