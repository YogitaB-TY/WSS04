package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\User\\Desktop\\Installables\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}

}
