package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp {

	@Test
	@Parameters({"userName", "password", "browser"})
	public void verifyLoginApp(String userName, String pwd, String browser) {

		WebDriver driver=null;
		
		// 1. Open Browser --- my choice
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		// sync

		// 2. Open Application - HRM
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		// 3. Enter USer Name - admin
		// driver.findElement(By.id("txtUsername")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(userName);

		// 3. Enter pwd - admin123
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pwd);

		// 4. Submit
		driver.findElement(By.name("Submit")).click();

	}

}
