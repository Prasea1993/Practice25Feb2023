package com.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

	private By linkSignUp = By.linkText("Sign Upsdsds");

	public SignUpPage navigateToSIgnUpPage() {

		try {

			click(linkSignUp);
			return new SignUpPage();
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}

// throw and throws 

// throw is basically to create custome excetion
