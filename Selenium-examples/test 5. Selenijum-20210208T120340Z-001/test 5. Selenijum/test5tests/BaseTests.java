package test5tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.Cart;
import test5pages.CheckoutPage;
import test5pages.FinishPage;
import test5pages.MainPage;
import test5pages.OverviewPage;
import test5pages.Shop;

public class BaseTests {

	WebDriver driver;
	MainPage mainPage;
	Shop shop;
	Cart cart;
	CheckoutPage checkout;
	FinishPage finishPage;
	OverviewPage overviewPage;
	

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		mainPage = new MainPage(driver);
		shop = new Shop(driver);
		cart = new Cart(driver);
		checkout = new CheckoutPage(driver);
		finishPage = new FinishPage(driver);
		overviewPage = new OverviewPage(driver);
		
		driver.manage().window().maximize();

	}

	@AfterClass
	public void posleClase() throws IOException {
		 driver.close();

	}

}
