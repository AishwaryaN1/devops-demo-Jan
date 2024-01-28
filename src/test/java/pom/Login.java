package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driverObj)
	{
		driver=driverObj;
	}
	
	public void LoginwithValidCreds(String Pass,String username)
	{
		Reporter.log("Username :"+username);
		Reporter.log("Pass :"+Pass);
		
		WebElement email=driver.findElement(By.id("email"));
		WebElement Password=driver.findElement(By.id("pass"));
		email.clear();
		email.sendKeys(username);
		
		Password.clear();
		Password.sendKeys(Pass);
	}

}
