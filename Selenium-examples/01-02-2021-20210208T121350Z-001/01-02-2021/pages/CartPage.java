package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	WebDriver driver;
	WebElement productName;
	WebElement productName2;
	WebElement productName3;
	WebElement remove;
	WebElement verifyRemove;
	
	public WebElement getProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	public WebElement getProductName2() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a"));
	}
	public WebElement getProductName3() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a"));
	}
	public WebElement getRemove() {
		return driver.findElement(By.className("remove"));
	}

	public WebElement getVerifyRemove() {
	
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
		
	}
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	public void deleteProduct() {
		this.getRemove().click();
	}
}
