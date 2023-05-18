package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_findElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//To print the text of all the links developed in this webpage
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			
			//getText() will return the text of the webelement
			
			System.out.println(links.get(i).getText());
		}
		
		
		/*
		 * for(WebElement link:links) { 
		 * 
		 * System.out.println(link.getText());
		 * 
		 *  }
		 */
		
	}

}
