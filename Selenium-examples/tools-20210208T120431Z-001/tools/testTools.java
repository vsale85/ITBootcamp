package tools;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testTools {
	WebDriver driver;
	pageTools pageTools;
	pageBooks pageBooks;
	pageLogin pageLogin;
	pageProfile pageProfile;
	JavascriptExecutor js;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		driver = new ChromeDriver();
		pageTools = new pageTools(driver);
		pageBooks = new pageBooks(driver);
		pageLogin = new pageLogin(driver);
		pageProfile = new pageProfile(driver);
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/");
		js.executeScript("arguments[0].scrollIntoView();", pageTools.getBookStoreApp());
		pageTools.navigateToBookStoreApp();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void logIn() throws InterruptedException {
		driver.manage().deleteAllCookies();

		pageBooks.logInButtonClik();
		Thread.sleep(2000);
		pageLogin.getUsernameField().clear();
		pageLogin.insertUsername("username123");
		Thread.sleep(2000);
		pageLogin.getPasswordField().clear();
		pageLogin.insertPassword("Password*123");
		Thread.sleep(2000);
		pageBooks.getLoginBtn().click();
		Thread.sleep(3000);

		assertEquals(pageLogin.getAssertLogin().getText(), "username123");
		System.out.println("Login kraj");
		Thread.sleep(4000);

	}

	@Test(priority = 5)
	public void addBook() throws InterruptedException {

		String checkBook;
		// book store
		js.executeScript("arguments[0].scrollIntoView();", pageBooks.getBookStore());
		pageBooks.bookStoreClick();
		checkBook = pageBooks.getBook1().getText();
		// add book
		pageBooks.getBook1().click();
		Thread.sleep(2000);
		pageBooks.addBookClick();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// profile
		js.executeScript("arguments[0].scrollIntoView();", pageBooks.getProfile());
		Thread.sleep(2000);
		pageBooks.profileClik();
		Thread.sleep(2000);
		// assert- book is in collection
		assertEquals(pageProfile.getBooks().getText(), checkBook);
		Thread.sleep(5000);
		// delete collection
		pageProfile.deleteClik();
		Thread.sleep(2000);
		pageProfile.confirmDelete();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// assert - collection is empty
		assertTrue(pageProfile.checkCollection());
		System.out.println("Kolekcija prazna:" + pageProfile.checkCollection());

		System.out.println("add book kraj");
	}

	@Test(priority = 10)
	public void logOut() throws InterruptedException {

		pageLogin.logOutButtonClik();
		Thread.sleep(2000);
		assertEquals(pageBooks.getLoginBtn().getText(), "Login");

		Thread.sleep(2000);
		System.out.println("Logout kraj");

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		// driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
