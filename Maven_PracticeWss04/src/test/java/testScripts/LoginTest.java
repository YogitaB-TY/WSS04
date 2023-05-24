package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibrary.ScreenshotMethod;
import pomRepository.LoginPage;
import pomRepository.WelcomePage;

public class LoginTest {
	
	@Test()
	public void loginTest() {
		String userName="yogbelavanaki@gmail.com";
		String password="Password@123";
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickLoginLink();
		welcomePage.setRegisterLink(driver.findElement(By.xpath("//a[@class='ico-register']")));
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(userName);
		
		loginPage.passwordTextField.sendKeys(password);
		loginPage.loginButton.click();
		
		ScreenshotMethod.screenshot(driver);
		driver.findElement(By.linkText("BOOKS")).click();
		System.out.println(ScreenshotMethod.screenshot(driver));
		/*
		 * driver.findElement(By.partialLinkText("Log")).click();
		 * driver.findElement(By.id("Email")).sendKeys(userName);
		 * driver.findElement(By.id("Password")).sendKeys(password);
		 * driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 * 
		 * if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().
		 * equals(userName)) {
		 * System.out.println("PASSED: User is successfully logged in"); }else {
		 * System.out.println("FAILED: User is not logged in"); } driver.quit();
		 */
	}
	
	

}
