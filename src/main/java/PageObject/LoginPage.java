package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	

	By email = By.name("email");
	By password = By.name("password");
	
	
	
	
	
	By checkBox = By.cssSelector(".form-group.sign-in-remember p label");
	
	By loginButton = By.xpath("//*[@class='sign-in-login-btn'] /input");
	
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
	 }
	
	
	public WebElement getCheck() {
		
		return driver.findElement(checkBox);
	}
	
	public  WebElement getEmail() {
		return driver.findElement(email);
	
	}
	public  WebElement getPassword() {
		return driver.findElement(password);
	
	}
	
	
	public WebElement getLoginButton() {
		
		
		return driver.findElement(loginButton);
	}
	
	
}
