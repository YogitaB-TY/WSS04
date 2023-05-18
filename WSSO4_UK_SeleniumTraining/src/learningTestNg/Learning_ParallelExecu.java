package learningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_ParallelExecu {
	
	@Test(invocationCount = 4, threadPoolSize = 4,enabled = true, alwaysRun = true)
	public void testCase() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		String userName="yogbelavanaki@gmail.com";
		String password="Password@123";
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(userName)) {
			System.out.println("PASSED: User is successfully logged in");
		}else {
			System.out.println("FAILED: User is not logged in");
		}
		driver.quit();
	}

}
