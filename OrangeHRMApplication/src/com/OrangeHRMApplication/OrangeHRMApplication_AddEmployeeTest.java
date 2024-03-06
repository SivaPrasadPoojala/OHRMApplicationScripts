package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 

public class OrangeHRMApplication_AddEmployeeTest extends BaseTest1
{
	
	WebDriver driver;
	
	FileInputStream propertiesFile;
	Properties properties;

	@Test(priority=1,description=" Validating OrangeHRM Application LogIn Page ")
	public void OrangeHRMApplicationLogInPageValidationTest() throws IOException
	{

	propertiesFile= new FileInputStream("./src/com/OrangeHRMApplication.properties");

	properties = new Properties();

	properties.load(propertiesFile);



	// Validating the OrnageHRM Application LogIN Page

	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM"; // title should be OrangeHRM
	System.out.println(" The Expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationWebPageTitle=driver.getTitle();
	System.out.println(" The Actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationWebPageTitle);

	if(actual_OrangeHRMApplicationWebPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	System.out.println(" Title of the OrangeHRM Application LogIN Page Matched - PASS ");
	}
	else
	{
	System.out.println(" Title of the OrangeHRM Application LogIN Page NOT Matched - Fail ");
	}

	// Validating URl Address -
	// Expected URl Address should have - "orangehrm-4.2.0.1"

	// Validating OrangeHRM Application LogIn Page based on a Text - Expected Text ="LOGIN Panel"(should be)

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The expected Text of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// id="logInPanelHeading"
	By LogInPageLogInPanelTextProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
	WebElement logInPageLogInPanelTxt=driver.findElement(LogInPageLogInPanelTextProperty);
	String actual__OrangeHRMApplicationLogInPageText=logInPageLogInPanelTxt.getText();
	System.out.println(" The expected Text of OrangeHRM Application LogIn Page is :- "+actual__OrangeHRMApplicationLogInPageText);

	if(actual__OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	System.out.println(" ********* Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	System.out.println(" *********Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
	}


	}

	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;

	Row logInTestDataRow;
	Cell logInTestDataUserNameCell;

	@Test(priority=2,description=" Validating OrangeHRM Application LogIn Functionality Test ")
	public void OrangeHRMApplication_LogInTest() throws IOException
	{



	logInTestDataFile = new FileInputStream("./src/com/OrangeHRMApplicationTestDataFiles/OrangeHRMApplication_LogInTestData.xlsx");
	workBook= new XSSFWorkbook(logInTestDataFile);
	logInTestDataSheet= workBook.getSheet("LogInTestData");


	logInTestDataRow=logInTestDataSheet.getRow(1);
	logInTestDataUserNameCell=logInTestDataRow.getCell(0);

	String userNameTestData=logInTestDataUserNameCell.getStringCellValue();


	// chromeBrowser.findElement(By.id("txtUsername")).sendKeys("srini");

	// String userNameProperty=By.id("txtUsername");

	//String userNameTestData="srini";
	By userNameProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageUserNameProperty"));// property of a WebElement is assigned to variable "userNameProperty"
	WebElement userName=driver.findElement(userNameProperty); // Identifying the WebElement on the Current WebPage with the Property
	userName.sendKeys(userNameTestData); // Performing Operation on the webElement


	// Password Properties
	// <input name="txtPassword"  autocomplete="off" type="password">

	//chromeBrowser.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

	// String passwordTestData="Q@Trainer7";

	Cell logInTestDataPasswordCell=logInTestDataRow.getCell(1);
	String passwordTestData=logInTestDataPasswordCell.getStringCellValue();

	By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationLogInPagePasswordProperty"));
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);

	//Thread.sleep(20000);

	// LogIn Button Properties
	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	//chromeBrowser.findElement(By.className("button")).click();

	By logInButtonProperty=By.className(properties.getProperty("orangeHRMApplicationLogInPageLogInButtonProperty"));
	WebElement logInButton= driver.findElement(logInButtonProperty);
	logInButton.click();


	}


	@Test(priority=3,description=" Validating OrangeHRM Application Home Page ")
	public void OrangeHRMApplication_HomePageValidationTest() throws IOException
	{

	// Validating the OrangeHRM Application Home Page
	// Expected Title should be - "OrangeHRM"

	String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM"; // title should be OrangeHRM
	System.out.println(" The Expected Title of the OrangeHRM Application HomePage Page is :- "+expected_OrangeHRMApplicationHomePageTitle);

	String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
	System.out.println(" The Actual Title of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageTitle);

	if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))
	{
	System.out.println(" Title of the OrangeHRM Application Home Page Matched - PASS ");

	Cell testResultCell=logInTestDataRow.createCell(2);
	testResultCell.setCellValue("Title of the OrangeHRM Application Home Page Matched - PASS ");

	}
	else
	{
	System.out.println(" Title of the OrangeHRM Application Home Page NOT Matched - Fail ");

	Cell testResultCell=logInTestDataRow.createCell(2);
	testResultCell.setCellValue("Title of the OrangeHRM Application Home Page NOT Matched - Fail ");
	}

	// saving the Excel File with The Test Result

	FileOutputStream testDataResultFile = new FileOutputStream("./src/com/OrangeHRMApplicationTestResultFiles/OrangeHRMApplication_LogInTestResultFile.xlsx");
	workBook.write(testDataResultFile); // Newly created file will be saved with the TetsData along with Test Result


	}


	@Test(priority=4,description=" Validating OrangeHRM Application Home Page PIM  ")
	public void OrangeHRMApplication_HomePagePIMTest()
	{

	// id="menu_pim_viewPimModule"
	By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimProperty);

	Actions pimAction = new Actions(driver);
	pimAction.moveToElement(pim).build().perform();

	}

	@Test(priority=5,description=" Validating OrangeHRM Application Home Page PIM AddEmployee  ")
	public void OrangeHRMApplication_HomePagePIMAddEmployeeTest()
	{

	// id="menu_pim_addEmployee"

	By addEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement addEmployee=driver.findElement(addEmployeeProperty);

	addEmployee.click();

	}

	@Test(priority=6,description=" Validating OrangeHRM Application Home Page AddEmployee Test ")
	public void OrangeHRMApplication_HomePageAddNewEmployeeTest() throws InterruptedException, IOException
	{

	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys("Srini10");

	// Performing Tab Operation - using the KeyBoard Function Key Operation
	Actions keyBoardActions = new Actions(driver);
	keyBoardActions.sendKeys(Keys.TAB).build().perform();


	// Since the Actions class object focus is at the MiddleName - without identifying the
	//   the properties of the MiddleName - directly using the Actions Class Object
//	      Automating the MiddleName WebELement

	keyBoardActions.sendKeys("Hello10").build().perform();

	// shifting to LastName
	keyBoardActions.sendKeys(Keys.TAB).build().perform();
	keyBoardActions.sendKeys("Chello10").build().perform();

	// shifting the focus to WebELemet Photograph

	keyBoardActions.sendKeys(Keys.TAB).build().perform();
	keyBoardActions.sendKeys(Keys.TAB).build().perform();

	// performing Enter Key of KeyBoard on the WebElement Photograph
	keyBoardActions.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(10000);

	java.lang.Runtime.getRuntime().exec("./AutoITTestScripts/EmployeePhotographImage.exe");

	Thread.sleep(10000);

	// id="btnSave"
	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);
	saveButton.click();



	}

	@Test(priority=7,description=" Validating OrangeHRM Application PersonalDetails Page Test ")
	public void OrangeHRMApplication_PersonalDetailsPageTest() throws InterruptedException, IOException
	{
	System.out.println(" Validating OrangeHRM Application PersonalDetails Page Test ");
	}


	@Test(priority=8,description=" Validating OrangeHRM Application PersonalDetails Test ")
	public void OrangeHRMApplication_PersonalDetailsTest() throws InterruptedException, IOException
	{

	// id="empPic"
	By employeePhotographImageProperty=By.id("empPic");
	WebElement employeePhotograph=driver.findElement(employeePhotographImageProperty);

	boolean flag=employeePhotograph.isDisplayed();

	if(flag)
	{
	System.out.println(" EmployeePhtograph Uploaded Succesfully - PASS ");
	}
	else
	{
	System.out.println(" EmployeePhtograph Failed to Upload - FAIL ");
	}

	}



	@Test(priority=9,description=" Validating OrangeHRM Application LogOut Functionality Test ")
	public void OrangeHRMApplication_LogOutTest() throws InterruptedException
	{

	By welComeAdminProperty=By.linkText(properties.getProperty("orangeHRMApplicationHomePageWelComeProperty"));
	WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
	welComeAdmin.click();


	// Synchronization
	// Java wait
	// Selenium WebDriver Statements are running very Fast - by the time the WebElement (LogOut) is
//	    loaded the Element is been searched by the WebDriver Script on the Webpage
//	      - a Wait time is required here so that the WebDriver Script will hault for some time
//	           so that the WebElement gets loaded -

	//Thread.sleep(5000); // wait Command of Java

	// after the wait time - the WebDriver will start running the Next statement of the Script
	//   this wait is applicable only for the next Statement only and not for the rest of the
//	       webDriver Script


	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	// Explicit Wait
	// this wait is implemented only for a particular element to be identified on the Webpage
//	     with the given property

	//  It is only set for the visibility of a particular WebElement - it not mandatory
//	     to be implemented for every WebElement of the functionality under Test

	//WebDriverWait logOutWebElementWait = new WebDriverWait(driver, 20);
	//logOutWebElementWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));


	By logOutProperty=By.linkText(properties.getProperty("orangeHRMApplicationHomePageLogOutProperty"));
	WebElement logOut=driver.findElement(logOutProperty);

	logOut.click();

	}

}
