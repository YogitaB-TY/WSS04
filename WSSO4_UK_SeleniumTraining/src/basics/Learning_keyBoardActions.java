package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_keyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		action.sendKeys(driver.findElement(By.id("small-searchterms")), "Laptops").build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
