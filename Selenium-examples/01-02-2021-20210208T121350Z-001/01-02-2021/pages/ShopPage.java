package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {

	WebDriver driver;
	WebElement addToCartBtn;
	WebElement addToCartBtn2;
	WebElement addToCartBtn3;
	WebElement viewCartBtn;
	
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(By.className("ajax_add_to_cart"));
	}


	public WebElement getAddToCartBtn2() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[2]"));
	}


	public WebElement getAddToCartBtn3() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/div/a[2]"));
	}


	public WebElement getViewCartBtn() {
		return driver.findElement(By.className("wc-forward"));
	}


	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addToCartClick() {
		this.getAddToCartBtn().click();
	}
	public void addToCartClick3() {
		this.getAddToCartBtn().click();
		this.getAddToCartBtn2().click();
		this.getAddToCartBtn3().click();
	}
	public void addToCart2Products() {
		this.getAddToCartBtn().click();
		this.getAddToCartBtn2().click();
		
	}
	
	public void viewCartClick() {
		this.getViewCartBtn().click();
	}
}
