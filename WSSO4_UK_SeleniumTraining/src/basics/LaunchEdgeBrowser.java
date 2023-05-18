package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
	public static void main(String[] args) {
		
		String value="C:\\Users\\User\\Desktop\\Installables\\edgedriver_win64\\msedgedriver.exe";
		String key="webdriver.edge.driver";
		System.setProperty(key, value);
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
	}

}
