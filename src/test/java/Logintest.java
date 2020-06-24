import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	
	public static WebDriver driver;
@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("sudheer.pulaparthiit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/span/span")).click();
		//driver.findElement(By.name("password")).sendKeys("chandu12155");
		/*
		 * 
		 * Added comments
		 */
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
