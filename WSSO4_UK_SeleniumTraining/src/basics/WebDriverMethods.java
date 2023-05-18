package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);

		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		//to maximise browser
		driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.navigate().to("https://github.com/");
		//driver.close();
		//driver.quit();
	}

}
