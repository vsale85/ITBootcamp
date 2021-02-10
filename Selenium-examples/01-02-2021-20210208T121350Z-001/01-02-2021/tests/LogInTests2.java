package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.MyAccountPage;

public class LogInTests2 {

	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
//	XSSFWorkbook wb;
	ExcelCitac citac;

	@BeforeClass
	public void preKlase() throws IOException {
//		File fajl = new File("data/testPlan.xlsx");
//		FileInputStream fis = new FileInputStream(fajl);
//		wb = new XSSFWorkbook(fis);
		citac = new ExcelCitac("data/testPlan.xlsx");
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void logIn() throws InterruptedException {

//		XSSFSheet logIn = wb.getSheet("logIn");
//		XSSFRow row1 = logIn.getRow(0);
//		XSSFCell username = row1.getCell(1);
//		XSSFRow row2 = logIn.getRow(1);
//		XSSFCell password = row2.getCell(1);
//		XSSFRow row3 = logIn.getRow(2);
//		XSSFCell expected = row3.getCell(1);

		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();
	//	myAccountPage.insertUsername(username.getStringCellValue());
		myAccountPage.insertUsername(citac.getCellData("logIn", 1, 2));
		myAccountPage.getPasswordInputField().clear();
	//	String pass = String.valueOf(password.getNumericCellValue());
		
//		DataFormatter formatter = new DataFormatter();
//		String pass = formatter.formatCellValue(password);
		
	//	myAccountPage.insertPassword(pass);
		myAccountPage.insertPassword(citac.getCellData("logIn", 2, 2));
		myAccountPage.logInButtonClik();

		Thread.sleep(2000);

		String textForAssert = myAccountPage.getLogOutLabel().getText();
	//	Assert.assertEquals(textForAssert, expected.getStringCellValue());

	}

//	@Test(priority = 5)
	public void logInEmptyFields() {
//		XSSFSheet logIn = wb.getSheet("logInEmptyFields");
//		XSSFRow row1 = logIn.getRow(0);
//		XSSFCell expected = row1.getCell(1);

		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();
		myAccountPage.getPasswordInputField().clear();
		myAccountPage.logInButtonClik();

		String errorText = myAccountPage.getErrorText().getText();
	//	Assert.assertEquals(errorText, expected.getStringCellValue());

	}

//	@Test(priority = 10)
	public void invalidLogIn() {
//		XSSFSheet logIn = wb.getSheet("invalidLogIn");
//		XSSFRow row1 = logIn.getRow(0);
//		XSSFCell username = row1.getCell(1);
//		XSSFRow row2 = logIn.getRow(1);
//		XSSFCell password = row2.getCell(1);
//		XSSFRow row3 = logIn.getRow(2);
//		XSSFCell expected = row3.getCell(1);

		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();
	//	myAccountPage.getUsernameInputField().sendKeys(username.getStringCellValue());
		myAccountPage.getPasswordInputField().clear();
	//	myAccountPage.getPasswordInputField().sendKeys(password.getStringCellValue());
		myAccountPage.logInButtonClik();

		String errorMessage = myAccountPage.getErrorMessage().getText();
	//	Assert.assertEquals(errorMessage, expected.getStringCellValue());

	}

//	@Test(priority = 15)
	public void logOut() throws InterruptedException {
//		logIn();
//		myAccountPage.getLogOutLabel().click();
//
//		XSSFSheet logIn = wb.getSheet("logOut");
//		XSSFRow row1 = logIn.getRow(0);
//		XSSFCell expected = row1.getCell(1);
//
//		String title = myAccountPage.getTitleLogIn().getText();
//		Assert.assertEquals(title, expected.getStringCellValue());
//
//		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterClass
	public void posleClase() {
		driver.close();
	}

}
