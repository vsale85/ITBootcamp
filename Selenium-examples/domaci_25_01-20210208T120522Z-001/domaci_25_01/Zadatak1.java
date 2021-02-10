package domaci_25_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.youtube.com");

		WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"search\"]"));
		searchInput.sendKeys("Rick Astley");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		search.click();
		Thread.sleep(5000);
		WebElement playSong = driver.findElement(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a"));
		playSong.click();
		Thread.sleep(3000);

		// WebElement settings =
		// driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[33]/div[2]/div[2]/button[4]"));
		// settings.click();
		// WebElement settings =
		// driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[33]/div[2]/div[2]/button[4]"));
		// settings.click();
		Thread.sleep(2000);

		int ads = driver.findElements(By.xpath("//*[@id=\"preskip-component:3\"]/span")).size();

		if (ads > 0) {
			Thread.sleep(6500);
			driver.findElement(By.xpath("//*[@id=\"skip-button:8\"]/span/button")).click();
		}

		Thread.sleep(5000);
		WebElement next = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[33]/div[2]/div[1]/a[2]")); // sledeca
		JavascriptExecutor js = (JavascriptExecutor) driver;												// pesma na dugme 
		js.executeScript("arguments[0].click()", next);														// next u videu
		
	//  WebElement next = driver.findElement(By.xpath(   // sledeca pesma iz liste sa desne strane
	//         "/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[2]/div/div[3]/ytd-watch-next-secondary-results-renderer/div[2]/ytd-compact-autoplay-renderer/div[2]/ytd-compact-video-renderer/div[1]/div/div[1]/a/h3/span"));
	//	next.click();
		
		Thread.sleep(2000);
		int ads2 = driver.findElements(By.xpath("//*[@id=\"skip-button:v\"]/span/button")).size();

		if (ads2 > 0) {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"skip-button:v\"]/span/button")).click();
		}

	}

}
