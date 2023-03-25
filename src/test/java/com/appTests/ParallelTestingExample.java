package com.appTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestingExample {
	
	
	public WebDriver driver;

	@Test
	public void A() {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.quit();
	}

	@Test
	public void B() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.quit();
	
		
		
	}

	@Test
	public void C() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.quit();
	
	}

	@Test
	public void D() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://msn.com");
		driver.quit();
	
	}
}
