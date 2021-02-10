package test5pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
	
	WebDriver driver;
	WebElement assertCompleteText;
	public FinishPage(WebDriver driver) {
		super();
		this.assertCompleteText = assertCompleteText;
	}
	public WebElement getAssertCompleteText() {
		return driver.findElement(By.className("subheader"));
	}
	
	public void assertShopping() {
		String expected = "Finish";
		assertEquals(getAssertCompleteText().getText(), expected);
	}
	
}
