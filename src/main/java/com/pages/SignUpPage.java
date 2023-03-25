package com.pages;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
	
	
	private By txtFullname=By.id("fullname");
	private By txtEmail=By.id("email");
	private By txtPwd=By.id("password");
	private By btnSubmit=By.xpath("//button[@type='submit']");
	
	
	public SignInPage signUpwithCredentials(String fullname, String email,String password) {
		try {
		sendKeys(txtFullname, fullname);
		sendKeys(txtEmail, email);
		sendKeys(txtPwd, password);
		click(btnSubmit);
		
		return new SignInPage();
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	

}
