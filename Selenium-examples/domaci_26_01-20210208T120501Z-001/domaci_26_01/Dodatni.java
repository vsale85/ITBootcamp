package domaci_26_01;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dodatni {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(2000);
	}
	@Test  (priority = 0)
	public void fieldsPresent() {
		ArrayList<String> elNamesExpected = new ArrayList<>();
		elNamesExpected.add("name");
		elNamesExpected.add("email");
		elNamesExpected.add("telephone");
		elNamesExpected.add("country");
		elNamesExpected.add("company");
		
		WebElement form = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div"));
		List<WebElement> inputs = form.findElements(By.tagName("input"));
		
		for (int i = 0; i < inputs.size(); i++) {
			assertEquals(inputs.get(i).getAttribute("name"), elNamesExpected.get(i));
		}
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea"));
		assertEquals(msg.getAttribute("name"), "message");
	}
	@Test (priority = 5)
	public void fillFields() throws InterruptedException {
		ArrayList<String> fill = new ArrayList<>();
		fill.add("Sasa");
		fill.add("xxx.xxxx@mail.xxx");
		fill.add("0123456789");
		fill.add("Serbia");
		fill.add("IT Bootcamp");
		
		WebElement form = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div"));
		List<WebElement> inputs = form.findElements(By.tagName("input"));
		
		for (int i = 0; i < inputs.size(); i++) {
			inputs.get(i).sendKeys(fill.get(i));
			Thread.sleep(2000);
		}
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea"));
		msg.sendKeys("Some random message");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]"));
		submit.click();
		Thread.sleep(2000);
		WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div[1]/div"));
		
		String confText = "Feedback has been sent to the administrator";
		assertEquals(confirmation.getText(), confText);
		Thread.sleep(2000);
		System.out.println(confirmation.getText());
	}
	@Test  (priority = 10)
	public void checkButtons() {
		
		WebElement btnSection = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]"));
		List<WebElement> buttons = btnSection.findElements(By.tagName("button"));
		
		for (int i = 0; i < buttons.size(); i++) {
		
			if (buttons.get(i).isDisplayed()) {
				assertTrue(true);
				System.out.println(buttons.get(i).getText());
			}else {
				assertTrue(false);
			}
			
		}

		System.out.println(buttons.size());
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.manage().deleteAllCookies();
			driver.navigate().refresh();
			Thread.sleep(2000);
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
		System.out.println("Kraj testova");
	}
}
