package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CartPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ShopPage;

public class BaseTests {

	WebDriver driver;
	MyAccountPage myAccountPage;
	MainPage mainPage;
	ExcelCitac citac;
	ShopPage shopPage;
	CartPage cartPage;

	@BeforeClass
	public void preKlase() throws IOException {

		citac = new ExcelCitac("data/testPlan.xlsx");
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		driver = new ChromeDriver();
		this.myAccountPage = new MyAccountPage(driver);
		this.mainPage = new MainPage(driver);
		this.shopPage = new ShopPage(driver);
		this.cartPage = new CartPage(driver);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void posleClase() throws IOException {
		driver.close();
		citac.fis.close();
	}

}
