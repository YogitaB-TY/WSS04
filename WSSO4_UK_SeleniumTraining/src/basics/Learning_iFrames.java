package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_iFrames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//1st - Index value
		//driver.switchTo().frame(0);
		
		//2nd - Id/name - String 
		//driver.switchTo().frame("courses-iframe"); //using id
		//driver.switchTo().frame("iframe-name");    // using name
		
		//3rd - xpath/ WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
	}

}
