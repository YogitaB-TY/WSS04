package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_WebElementMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement bookLink=driver.findElement(By.linkText("BOOKS"));
		
		//bookLink.clear();// to clear existing value from text field
		//bookLink.click(); // to perform click action on webelement
		System.out.println(bookLink.getAttribute("href")); //used to fetch the attribute value 
		//when attribute name is passed
		
		System.out.println(bookLink.getCssValue("color")); //used to fetch css value such as color, font etc
		System.out.println(bookLink.getTagName());// used to fetch tag of the element
		System.out.println(bookLink.getText()); // used to fetch text of the element
		System.out.println(bookLink.isDisplayed()); // used to check whether element is displayed in web page
		System.out.println(bookLink.isEnabled());// used to check whether element is enabled in web page
		bookLink.isSelected();// used to check if element is selected 
		bookLink.submit();//used to click on elements with type='submit'
		bookLink.getLocation();//returns location of the element in the type of Point
		bookLink.getRect();// returns the rectuangular propery of element in the type of Rectangle
		bookLink.getSize();// returns size of the welement in the type of Dimension
		bookLink.findElement(null);
		bookLink.findElements(null); //used to find child of WebElement
		bookLink.sendKeys(args);// used to enter value into text field
	}

}
