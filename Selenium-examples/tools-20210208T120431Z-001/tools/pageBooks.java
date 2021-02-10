package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBooks {
	WebDriver driver;
	WebElement loginBtn;
	WebElement bookStore;
	WebElement book1;
	WebElement addToCollection;
	WebElement profile;

	public pageBooks(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginBtn() {
		return driver.findElement(By.id("login"));
	}

	public WebElement getBookStore() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]"));
	}

	public WebElement getBook1() {
		return driver.findElement(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a"));
	}

	public WebElement getAddToCollection() {

		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/div[2]/button"));
	}

	public WebElement getProfile() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]"));
	}

	public void logInButtonClik() {
		this.getLoginBtn().click();
	}

	public void bookStoreClick() {
		this.getBookStore().click();
	}

	public void addBookClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", this.getAddToCollection());
		this.getAddToCollection().click();
	}

	public void profileClik() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", this.getProfile());
		this.getProfile().click();
	}

}
