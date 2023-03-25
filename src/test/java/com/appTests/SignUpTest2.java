package com.appTests;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.driver.Driver;
import com.pages.HomePage;
import com.pages.SignUpPage;

public class SignUpTest2 extends BaseTest{
	
	HomePage home;
	SignUpPage signup;
	
	
	@Test
	public void validateSignUp2(Hashtable<String,String> data) throws IOException {
		
		Driver.initialize(data.get("browserType"));
		
		home=new HomePage();
		
		signup=home.navigateToSIgnUpPage();
		signup.signUpwithCredentials(data.get("name"), data.get("email"), data.get("password"));
		
		
	}
	
	

}
