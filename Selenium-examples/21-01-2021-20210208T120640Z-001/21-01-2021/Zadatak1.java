package domaci21_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		
		WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		elements.click();								 
														   
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
		textBox.click();
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullName.clear();
		fullName.sendKeys("Sasa Vasiljevic");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.clear();
		email.sendKeys("sasa.vasiljevic@gmail.com");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
		checkBox.click();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		
		dropDown.click();									
		WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
		desktop.click();
		Thread.sleep(2000);
		
		WebElement leftElements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div"));
		leftElements.click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
