package testScripts;

import org.testng.annotations.Test;

public class MavenScriptTest {
	
	@Test
	public void test() {
		System.out.println("Hello Maven");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		
	}

}
