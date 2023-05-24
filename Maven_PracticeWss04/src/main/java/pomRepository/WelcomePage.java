package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	/**
	 * this is where we store webelements from Welcome Page
	 */

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//find by is going to return me webelements, so we store in WebElement type
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	public void clickRegisterLink() {
		registerLink.click();
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public void clickLoginLink() {
		loginLink.click();
	}
	
	@FindBy(xpath = "//input[@value='Search store']")
	public WebElement searchTextField;
	
	public void enterSearchValue(String value) {
		searchTextField.sendKeys(value);
	}
	
	@FindBy(css = "input[value='Search']")
	public WebElement searchButton;
	
	
	
}
