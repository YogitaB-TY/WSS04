package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_selectClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		/*
		 * for(int i=0;i<=5;i++) { WebElement sortByDD=
		 * driver.findElement(By.id("products-orderby")); Select sel=new
		 * Select(sortByDD); sel.selectByIndex(i); }
		 */
		
		/*
		 * WebElement sortByDD= driver.findElement(By.id("products-orderby")); Select
		 * sel=new Select(sortByDD); sel.selectByVisibleText("Name: Z to A");
		 * 
		 * WebElement sortByDD1= driver.findElement(By.id("products-orderby")); Select
		 * sel1=new Select(sortByDD1); sel1.selectByIndex(3);
		 * 
		 * WebElement sortByDD2= driver.findElement(By.id("products-orderby")); Select
		 * sel2=new Select(sortByDD2);
		 * sel2.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
		 */
		
		//address of the drop down
		WebElement sortBydd=driver.findElement(By.id("products-orderby"));
		
		//select class object
		Select sel=new Select(sortBydd);
		
		//use getOptions to fetch List<WebElement>
		List<WebElement> options = sel.getOptions();
		
		for(int i=0;i<options.size();i++) {
			WebElement sortByDropDown=driver.findElement(By.id("products-orderby"));
			Select select=new Select(sortByDropDown);
			select.selectByIndex(i);
		}
		
	}

}
