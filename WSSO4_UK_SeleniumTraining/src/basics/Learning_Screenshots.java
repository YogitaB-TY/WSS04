package basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Learning_Screenshots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
	   
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File dest=new File("./Screenshots/screenshot1.png");
		File temp= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
		
		/*
		 * FluentWait<> wait =new FluentWait(driver); wait.pollingEvery(100,
		 * TimeUnit.MILLISECONDS); wait.withTimeout(10, TimeUnit.SECONDS);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * wait.ignoring(org.openqa.selenium.NoSuchElementException);
		 */
	}

}
