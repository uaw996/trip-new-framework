package testMethodsAnna;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;

public class LoginTest extends base {

	public WebDriver driver;
	
	
	@BeforeTest
	public void setup() throws IOException {
		
	driver=	initializerDriver();
		
	}
	
	@Test
	public void Validation() {
		
		driver.get(prop.getProperty("url"));

		
		LandingPage lanp = new LandingPage(driver);
		
		lanp.getLoginbtn().click();
		
		LoginPage logp = new LoginPage(driver);
		
		logp.getEmail().sendKeys("awasarmol1991@gmail.com");
		logp.getPassword().sendKeys("Umesh67#");
		
		logp.getCheck().click();
		logp.getLoginButton().click();
		
		
	}
	
}
