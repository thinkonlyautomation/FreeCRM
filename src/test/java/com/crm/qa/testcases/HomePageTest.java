package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.page.HomePage;
import com.crm.qa.page.LoginPage;
import com.crm.qa.utils.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public HomePageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	@Test(priority = 1)
	public void validatePageTitle() {
		String pageTitle=homePage.getHomePageTitle();
		Assert.assertEquals(pageTitle, "CRMPRO");
	}

	@Test(priority = 2)
	public void validateUserName() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.validateUserName());
	}
	
	
	@Test(priority = 3)
	public void clickConatctsLink() {
		//testUtil.switchToFrame();
		homePage.clickConatctsLink();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
