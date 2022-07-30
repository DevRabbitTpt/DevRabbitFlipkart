package Flipkart;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class GitHub {
	WebDriver driver;

	@Test
	public void flipkart() throws Exception{
		System.out.println("Hello");
	//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("pendrive",Keys.ENTER);
		
		Thread.sleep(2000);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\java -Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
	}

	@AfterTest
	public void afterTest() {
	//	driver.close();
	}

}
