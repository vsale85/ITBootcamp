package test5tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests{

	
	@BeforeMethod
	public void goToMainPage() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}
	
	@Test (priority = 5)
	public void logInTest() throws InterruptedException {
		
		
		mainPage.inputUsername();
		Thread.sleep(2000);
		mainPage.inputPassword();
		Thread.sleep(2000);
		mainPage.loginClick();
		Thread.sleep(2000);
		shop.assertLogIn();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 10)
	public void orderingTests() throws InterruptedException {
		
		logInTest();
		
		shop.addToCart();
		
		shop.goToCart();
		cart.checkout();
		Thread.sleep(2000);
		checkout.inputName();
		checkout.inputLastName();
		checkout.inputPostalCode();
		checkout.clickContinue();
		Thread.sleep(2000);
		overviewPage.finish();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
	
		shop.logOut();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
