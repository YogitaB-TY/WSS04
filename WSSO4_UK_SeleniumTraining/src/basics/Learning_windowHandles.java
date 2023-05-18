package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_windowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		driver.findElement(By.linkText("BOOKS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
				for(String s:windowHandles) {
					System.out.println(s);
				}
	}

}
