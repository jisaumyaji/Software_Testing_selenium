package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.Feature_1;

public class TestFeature_1 extends BaseTest {

	@Test(priority = 0)
	public void feature1PageTitleTest() {
		feature1 = new Feature_1(driver);
		String title = feature1.feature1GetTitle();
		System.out.println("Feature 1 page title is: " + title);
		Assert.assertEquals(title, "Swag Labs");
	}
	
	

	@Test(priority = 1)
	public void feature1LogicFlow1() throws InterruptedException {
		feature1.LogicFlow_1();
		
		//Assert.assertEquals(title, "");
	}
	
	
	
	
}
