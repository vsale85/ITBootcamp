package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {
	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement assertLogin;
	WebElement logOutBtn;

	public pageLogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getAssertLogin() {
		return driver.findElement(By.id("userName-value"));
	}

	public WebElement getLogOutBtn() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/button"));
	}

	public void insertUsername(String username) {
		this.getUsernameField().sendKeys(username);
	}

	public void insertPassword(String password) {
		this.getPasswordField().sendKeys(password);
	}

	public void logOutButtonClik() {
		this.getLogOutBtn().click();
	}

}
