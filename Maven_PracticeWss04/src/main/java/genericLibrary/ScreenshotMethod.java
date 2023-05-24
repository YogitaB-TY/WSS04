package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {
	
	public static String screenshot(WebDriver driver) {
		
		//Local data time is a class in java that helps us get the current data and 
		//time of the system
		// the method now will return the data and time in the same format
		LocalDateTime dateTime=LocalDateTime.now();
		
		String screenshotName=dateTime.toString().replaceAll(":", "-");
		
		String filePath="./Screenshots/"+screenshotName+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(filePath);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return filePath;
	}

}
