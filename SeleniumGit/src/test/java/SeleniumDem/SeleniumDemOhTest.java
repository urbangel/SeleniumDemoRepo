package SeleniumDem;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemOhTest {
	private static Logger logger= LogManager.getLogger(SeleniumDemOh.class);
	@Test
	public void test() throws InterruptedException {
			
			logger.error("Logger is configured correctly");
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.crisol.com.pe/customer/account/login/");
			WebElement user = driver.findElement(By.id("email"));
			WebElement pass = driver.findElement(By.id("pass"));
			WebElement botonn = driver.findElement(By.id("send2"));
			Thread.sleep(5000);
			user.sendKeys("urbangel011@gmail.com");
			pass.sendKeys("Angel123");
			botonn.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.quit();

	
	}
}
