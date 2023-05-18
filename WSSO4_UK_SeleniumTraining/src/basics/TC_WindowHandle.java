package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String parentHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String windowHandle:windowHandles) {
			
			driver.switchTo().window(windowHandle);
			
			if(driver.getCurrentUrl().contains("twitter")) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.partialLinkText("BOOK")).click();

	}

}
