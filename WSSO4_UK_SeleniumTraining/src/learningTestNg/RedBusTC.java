package learningTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBusTC {
	
	@Test
	public void redBusTC() {
    ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
	}

}
