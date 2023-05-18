package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CloseAllWindowsWQuit {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		Thread.sleep(3000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle: windowHandles) {
			driver.switchTo().window(windowHandle);	
			if(!driver.getWindowHandle().equals(parentHandle)) {
				driver.close();
			}
		}
		}
		
		
	}


