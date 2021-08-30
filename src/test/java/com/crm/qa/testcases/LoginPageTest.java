package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.page.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
		
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
	}
	@Test(priority = 1)
	public void ValidatePageTitle() {
		
		
		String title= loginPage.getLoginPageTitle();
		
		assertEquals(title, "Free CRM - CRM software for customer relationship management, sales, and support.");
		
	}
	@Test(priority = 2)
	public void ValidateLogo() {
	
		assertTrue(loginPage.validateLogo());
		
	}
	@Test(priority = 3)
	public void Login() {
		
		loginPage.login(prop.getProperty("UserName"),prop.getProperty("Password"));
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
