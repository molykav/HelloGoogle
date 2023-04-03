package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest1 {

	static WebDriver driver;


	
	@	Test
	public static void googleSearchTest() throws Throwable {

		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("WebDriver");		
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
	}

	@AfterTest
	public void tearDownTest() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		System.out.println("Test executed successfully");
	}

}