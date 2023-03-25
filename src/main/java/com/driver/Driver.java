package com.driver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.constants.Constants;
import com.reports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * SingleTon Pattern
 * Make sure to update the test name in the excel
 */
public class Driver {

	public static WebDriver driver;

	private Driver(String browserType) throws IOException {

		try {

			// chrome browser execution
			if (browserType.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}
			// Android browser stack cloud execution
			else if (browserType.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			}

			// Android sauce labs cloud execution
			else if (browserType.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
			
			else if (browserType.equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();

			}

			else {
				LogStatus.fatal(("Please check your browser type"));
			}
			DriverManager.setDriver(driver);
			DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().get(Constants.APP_URL);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialize(String browserType) throws IOException {
		if (DriverManager.getDriver() == null)
			new Driver(browserType);
	}

}
