package learningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Assertions {
	
	@Test
	public void assertionsTest() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*
		 * //Assert.assertTrue(driver.getCurrentUrl().equals(
		 * "https://demowebshop.tricentis.com/"));
		 * Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		 * Assert.assertEquals(driver.getTitle(), "De Web Shop");
		 */
		
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "De Web Shop");
	
		driver.quit();
		
		ast.assertAll();
	}

}
