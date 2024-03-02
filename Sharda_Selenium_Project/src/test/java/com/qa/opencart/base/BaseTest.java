package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.Feature_1;

public class BaseTest {
	
	DriverFactory df;
	
	protected WebDriver driver;
	
	public Feature_1 feature1;

	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browserName) {
		df = new DriverFactory();
		
		String browser = "Chrome";
		
		if(browserName !=null) {
			browser = browserName;
		}
		
		
		driver = df.init_driver(browser);
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
