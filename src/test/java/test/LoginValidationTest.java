package test;

import org.testng.annotations.Test;

import pom.Login;

public class LoginValidationTest extends BaseTest {
	
	@Test
	public void ValidUsernameValidPasswordTest()
	{
		String username="ash@gmail.com";
		String Pass="ABCD1234";
		
		Login login =new Login(driver);
		login.LoginwithValidCreds(Pass, username);
		
		
	}

}
