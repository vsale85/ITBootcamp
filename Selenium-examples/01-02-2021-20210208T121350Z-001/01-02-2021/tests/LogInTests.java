package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends BaseTests {

	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void logIn() throws InterruptedException {

		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();

		myAccountPage.insertUsername(citac.getCellData("logIn", 1, 2));
		myAccountPage.getPasswordInputField().clear();

		myAccountPage.insertPassword(citac.getCellData("logIn", 2, 2));
		myAccountPage.logInButtonClik();

		Thread.sleep(2000);

		String textForAssert = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(textForAssert, "Log out");

	}

	// @Test(priority = 5)
	public void logInEmptyFields() {

		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();
		myAccountPage.getPasswordInputField().clear();
		myAccountPage.logInButtonClik();

		String errorText = myAccountPage.getErrorText().getText();
		Assert.assertEquals(errorText, citac.getCellData("logInEmptyFields", 1, 2));

	}

	// @Test(priority = 10)
	public void invalidLogIn() {

		String expected = citac.getCellData("invalidLogIn", 3, 2);
		String username = citac.getCellData("invalidLogIn", 1, 2);
		String password = citac.getCellData("invalidLogIn", 2, 2);
		mainPage.navigateToMyAccoutn();
		myAccountPage.getUsernameInputField().clear();
		myAccountPage.getUsernameInputField().sendKeys(username);
		myAccountPage.getPasswordInputField().clear();
		myAccountPage.getPasswordInputField().sendKeys(password);
		myAccountPage.logInButtonClik();

		String errorMessage = myAccountPage.getErrorMessage().getText();
		Assert.assertEquals(errorMessage, expected);

	}

	// @Test(priority = 15)
	public void logOut() throws InterruptedException {
		logIn();
		myAccountPage.getLogOutLabel().click();
		String expected = citac.getCellData("logOut", 1, 2);

		String title = myAccountPage.getTitleLogIn().getText();
		Assert.assertEquals(title, expected);

		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}
