package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.constants.Constants;
import com.driver.DriverManager;
import com.reports.LogStatus;
import com.utils.TestUtils;

/*
 * Only refer the BasePage
 */

public class BasePage {

	

	protected BasePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private void explicitlyWait(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Constants.EXPLICITWAIT);
		wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(by)));
	}

	

	protected void click(By by) {
		explicitlyWait(by);
		LogStatus.info("Clicked on element::" + DriverManager.getDriver().findElement(by));
		LogStatus.pass("Screenshot below", TestUtils.pullScreenshotPath());
		WebElement element = DriverManager.getDriver().findElement(by);
		element.click();
		LogStatus.pass("Clicking is successfull on " + element);
	}

	protected void sendKeys(By by, String input) {
		explicitlyWait(by);
		LogStatus.info("Sending keys to element::" + DriverManager.getDriver().findElement(by));
		LogStatus.pass("Screenshot below", TestUtils.pullScreenshotPath());
		WebElement element = DriverManager.getDriver().findElement(by);
		element.sendKeys(input);
		LogStatus.pass("Sending " + input + " is successfull on " + element);
	}

	protected String getElementText(By by) {
		explicitlyWait(by);
		WebElement element = DriverManager.getDriver().findElement(by);
		LogStatus.info("get text of element::" + element);
		return element.getText().trim();

	}

	protected void moveToElement(By by) {
		Actions actions = new Actions(DriverManager.getDriver());
		WebElement element = DriverManager.getDriver().findElement(by);
		actions.moveToElement(element);
		LogStatus.info("mouse over on element::" + element);

	}

}
