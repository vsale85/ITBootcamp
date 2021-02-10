package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement login;
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsername() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLogin() {
		return driver.findElement(By.id("login-button"));
	}
	
	public void inputUsername() {
		this.getUsername().clear();
		this.getUsername().sendKeys("standard_user");
	}
	public void inputPassword() {
		this.getPassword().clear();
		this.getPassword().sendKeys("secret_sauce");
	}
	public void loginClick() {
		this.getLogin().click();
	}
}
