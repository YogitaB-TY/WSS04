package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver"; //which browser to launch
		String value="C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe"; // path of the browser driver
		
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
