package test5pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shop {
	WebDriver driver;
	WebElement logOut;
	WebElement addToCartBtn;
	WebElement cart;
	WebElement menu;
	WebElement closeMenu;
	
	public Shop(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getLogOut() {
		return driver.findElement(By.id("logout_sidebar_link"));
	}

	public WebElement getAddToCartBtn() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	}


	public WebElement getCart() {
		return driver.findElement(By.className("shopping_cart_link"));
	}
	
	
	public WebElement getMenu() {
		return driver.findElement(By.className("bm-burger-button"));
	}


	public WebElement getCloseMenu() {
		return driver.findElement(By.className("bm-cross-button"));
	}


	public void logOut() {
		openMenu();
		getLogOut().click();
	}
	
	public void assertLogIn() throws InterruptedException {
		openMenu();
		Thread.sleep(2000);
		assertEquals(getLogOut().getText(), "Logout");
		getCloseMenu().click();
	}
	public void openMenu() {
		getMenu().click();
	}
	
	public void addToCart() {
		getAddToCartBtn().click();
	}
	
	public void goToCart() {
		getCart().click();
	}
	
}
