package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learning_notificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		//option.addArguments("start-maximized");
		//option.addArguments("--headless");
		option.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		
		//driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		System.out.println("Browser launched");

	}

}
