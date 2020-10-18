package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	By login = By.xpath("//*[@class='js-ajx-usr-login']");
	
	By checkBox = By.cssSelector(".form-group.sign-in-remember p label");
	
	By loginButton = By.xpath("//*[@class='sign-in-login-btn'] /input");
	
	 public LandingPage(WebDriver driver) {
		 this.driver=driver;
	 }
	
	public WebElement getLoginbtn() {
		
		return driver.findElement(login);
		
	}
	
	public WebElement getCheck() {
		
		return driver.findElement(checkBox);
	}
	
	public WebElement getLoginButton() {
		
		
		return driver.findElement(loginButton);
	}
	
	
}
