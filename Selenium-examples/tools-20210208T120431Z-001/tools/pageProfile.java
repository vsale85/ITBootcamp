package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageProfile {
	WebDriver driver;
	WebElement books;
	WebElement deleteBooks;
	WebElement deleteConfirm;
	WebElement emptyCollection;

	public pageProfile(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getBooks() {
		return driver.findElement(By
				.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span"));
	}

	public WebElement getDeleteBooks() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/button"));
	}

	public WebElement getDeleteConfirm() {
		return driver.findElement(By.id("closeSmallModal-ok"));
	}

	public WebElement getEmptyCollection() {
		return driver.findElement(
				By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]"));
	}

	public void deleteClik() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", this.getDeleteBooks());
		this.getDeleteBooks().click();
	}

	public void confirmDelete() {
		this.getDeleteConfirm().click();
	}

	public boolean checkCollection() {
		if (getEmptyCollection().getText().equals(" ")) {
			return true;
		} else {
			return false;
		}
	}
}
