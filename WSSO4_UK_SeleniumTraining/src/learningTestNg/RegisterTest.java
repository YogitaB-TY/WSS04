package learningTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends Base{
	
	
	/**
	 * Register test case
	 */
	
	@Test
	public void registerTest() {
		
		driver.findElement(By.className("ico-register")).click();
		String gender="F";
		driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
		String FirstName="Deepika";
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		String LastName="Padukone";
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		String email="deepikaveer@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(email);
		String password="Password@123";
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(email)) {
			System.out.println("PASSED: User registered successfully");
		}else {
			System.out.println("FAILED: USer is not registered");
		}
	}

}
