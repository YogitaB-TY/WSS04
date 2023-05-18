package learningTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(enabled = true, dataProvider = "LoginData")
	public void loginTest(String userName,String password) {
		/*String userName="yogbelavanaki@gmail.com";
		String password="Password@123";*/
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	
	@DataProvider(name="LoginData",parallel = false)
	public String[][] testData() throws EncryptedDocumentException, IOException{
		return Learning_readExcel.testData("Login");
	}


}
