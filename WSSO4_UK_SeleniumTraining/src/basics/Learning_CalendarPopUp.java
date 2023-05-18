package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_CalendarPopUp {
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='May 2023']/../..//li[text()='15']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rdatelbl")).click();
		
	}
}
