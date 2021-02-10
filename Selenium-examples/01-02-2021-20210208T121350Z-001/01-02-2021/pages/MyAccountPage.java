package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement logInBtn;
	WebElement logOutLabel;
	WebElement errorText;
	WebElement errorMessage;
	WebElement titleLogIn;
	

	public WebElement getUsernameInputField() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLogInBtn() {
		return driver.findElement(By.name("login"));
	}

	public WebElement getLogOutLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
	}

	public WebElement getErrorText() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
	}

	public WebElement getErrorMessage() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
	}

	public WebElement getTitleLogIn() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/h2"));
	}

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void insertUsername(String username) {
		this.getUsernameInputField().sendKeys("customer");
	}

	public void insertPassword(String password) {
		this.getPasswordInputField().sendKeys("123456789");
	}

	public void logInButtonClik() {
		this.getLogInBtn().click();
	}

	public void logIn(String username, String password) {

		this.getUsernameInputField().sendKeys("customer");
		this.getPasswordInputField().sendKeys("123456789");
		this.logInBtn.click();
	}

}
