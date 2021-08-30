package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.page.ContactsPage;
import com.crm.qa.page.HomePage;
import com.crm.qa.page.LoginPage;
import com.crm.qa.utils.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	public ContactsPageTest() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("UserName"), prop.getProperty("Password"));
		testUtil.switchToFrame();
		contactsPage=homePage.clickConatctsLink();
	}
	
	@Test(priority = 1)
	public void validateContactLabel() {
		String text=contactsPage.getContactsLabel();
		Assert.assertEquals(text, "Contacts");
		
	}
	
	@Test(priority = 2)
	public void SelectCont() {
		
		contactsPage.selectContact();
		
		
	}
	@DataProvider
	public Object[][] getTestData() {
		Object data[][]=TestUtil.getTestData("Contacts");
		return data;
	}
	
	@Test(priority = 4, dataProvider="getTestData")
	public void validateCreateNewContact(String title,String fname,String lname,String comp) {
		contactsPage=homePage.clickNewConatctLink();
		contactsPage.createNewContact(title, fname, lname, comp);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
