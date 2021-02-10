package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {
	WebDriver driver;
	WebElement finishShopping;
	public OverviewPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getFinishShopping() {
		return driver.findElement(By.className("cart_button"));
	}
	
	public void finish() {
		getFinishShopping().click();
	}
}
