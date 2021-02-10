package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductToCart extends BaseTests {

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
	}

//	@Test (priority = 5)
	public void addProductToCart() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.addToCartClick();
		Thread.sleep(2000);
		shopPage.viewCartClick();

		Thread.sleep(2000);

		String name = cartPage.getProductName().getText();
		Assert.assertEquals(name, "Flying Ninja");

	}
	@Test (priority = 6)
	public void add3ProductToCart() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.addToCartClick3();
		Thread.sleep(2000);
		shopPage.viewCartClick();

		Thread.sleep(2000);
		
		String name1 = cartPage.getProductName().getText();
		Assert.assertEquals(name1, citac.getCellData("cartRemove", 2, 2));
		String name2 = cartPage.getProductName2().getText();
		Assert.assertEquals(name2, citac.getCellData("cartRemove", 3, 2));
		String name3 = cartPage.getProductName3().getText();
		Assert.assertEquals(name3, citac.getCellData("cartRemove", 4, 2));
		
		
	}
	@Test (priority = 15)
	public void add2ProductToCart() throws InterruptedException {
		mainPage.navigateToShop();
		Thread.sleep(2000);
		shopPage.addToCart2Products();
		Thread.sleep(2000);
		shopPage.viewCartClick();

		Thread.sleep(2000);
		
		String name1 = cartPage.getProductName().getText();
		Assert.assertEquals(name1, citac.getCellData("cartRemove", 2, 2));
		String name2 = cartPage.getProductName2().getText();
		Assert.assertEquals(name2, citac.getCellData("cartRemove", 3, 2));
		
		
	}
	@Test (priority = 16)
	public void deleteOneProductFromCart() throws InterruptedException {
		
		mainPage.navigateToCart();
		Thread.sleep(2000);
		cartPage.deleteProduct();
		Thread.sleep(2000);
		
		String verifyOneProduct = cartPage.getProductName().getText();
		System.out.println(verifyOneProduct);
		String expected = citac.getCellData("cartRemove", 3, 2);
		Thread.sleep(2000);
		Assert.assertEquals(verifyOneProduct, expected);

	}
	
	@Test (priority = 10)
	public void delete3ProductFromCart() throws InterruptedException {
		
		mainPage.navigateToCart();
		Thread.sleep(2000);
		cartPage.deleteProduct();
		Thread.sleep(2000);
		cartPage.deleteProduct();
		Thread.sleep(2000);
		cartPage.deleteProduct();
		Thread.sleep(2000);
		
		String verifyRemove = cartPage.getVerifyRemove().getText();
		System.out.println(verifyRemove);
		String expected = citac.getCellData("cartRemove", 1, 2);
		Thread.sleep(2000);
		Assert.assertEquals(verifyRemove, expected);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
	//	driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}
