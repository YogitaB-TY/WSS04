package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class LearningFireFoxOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		
		//options.addArguments("--disable-notifications");

		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.easemytrip.com/");
		
	}
}
