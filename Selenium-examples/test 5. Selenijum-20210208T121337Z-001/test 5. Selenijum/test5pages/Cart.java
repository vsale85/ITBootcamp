package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	
	WebDriver driver;
	WebElement checkout;
	
	public Cart(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getCheckout() {
		return driver.findElement(By.className("checkout_button"));
	}
	
	public void checkout() {
		getCheckout().click();
	}
	
}
