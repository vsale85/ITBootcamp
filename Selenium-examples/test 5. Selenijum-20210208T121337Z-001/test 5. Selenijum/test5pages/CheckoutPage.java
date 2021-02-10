package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	WebElement name;
	WebElement lastName;
	WebElement postalCode;
	WebElement continueShopBtn;
	public CheckoutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getName() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getPostalCode() {
		return driver.findElement(By.id("postal-code"));
	}
	public WebElement getContinueShopBtn() {
		return driver.findElement(By.className("cart_button"));
	}
	
	public void inputName() throws InterruptedException {
		getName().clear();
		getName().sendKeys("Sasa");
		Thread.sleep(2000);
	}
	public void inputLastName() throws InterruptedException {
		getLastName().clear();
		getLastName().sendKeys("Vasiljevic");
		Thread.sleep(2000);
	}
	public void inputPostalCode() throws InterruptedException {
		getPostalCode().clear();
		getPostalCode().sendKeys("21000");
		Thread.sleep(2000);
	}
	public void clickContinue() {
		getContinueShopBtn().click();
	}
}
