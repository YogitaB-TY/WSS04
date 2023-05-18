package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_rightClickActions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action=new Actions(driver);
		/*action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']")))
		.contextClick().build().perform();*/
		
		action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.build().perform();
		
		action.click(driver.findElement(By.xpath("//span[text()='Edit']"))).build().perform();
	}
	

}
