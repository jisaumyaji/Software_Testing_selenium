package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class Feature_1  {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public Feature_1(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	

	private By username = By.name("user-name");
	private By password = By.name("password");
	private By loginBtn = By.name("login-button");
	private By menuBtn = By.id("react-burger-menu-btn");
	private By aboutLink = By.linkText("About");
	
	public String feature1GetTitle() {
		return elementUtil.getPageTitle();
	}

	public void LogicFlow_1() throws InterruptedException {

		elementUtil.doSendKeys(username, "standard_user");
		elementUtil.doSendKeys(password, "secret_sauce");
		elementUtil.doClick(loginBtn);

		Thread.sleep(2000);

		elementUtil.doClick(menuBtn);

		Thread.sleep(2000);

		elementUtil.doClick(aboutLink);

	}

}
