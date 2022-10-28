package search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseSearch {

	@Test
	public void verifySearch() {

		// open browser.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//sync -- wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//facebook
		driver.get("https://www.facebook.com/"); //10 sec
		//click on create account button
		driver.findElement(By.xpath("//div[5]")).click(); //10 sec
		
		//enter first name
		driver.findElement(By.name("firstname")).sendKeys("Uday"); //10 sec
		

}

}