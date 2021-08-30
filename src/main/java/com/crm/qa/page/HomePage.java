package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	//Objects
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement linkContacts;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement linkDeals;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement linkTask;
	@FindBy(xpath="//td[contains(text(),'group automation')]")
	WebElement userNameLabel;
	//@FindBy(name="mainpanel")
	//WebElement mainPanel;

	//initialize page Objects
	public HomePage() {

		PageFactory.initElements(driver,this);

	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}
	public boolean validateUserName() {
		
		return userNameLabel.isDisplayed();

	}

	public ContactsPage clickConatctsLink() {
	
		linkContacts.click();
		return new ContactsPage();
	}
	public ContactsPage clickNewConatctLink() {
		Actions act=new Actions(driver);
		act.moveToElement(linkContacts).build().perform();
		newContact.click();
		return new ContactsPage();
	}
	public DealsPage clickDealsLink() {
		
		linkDeals.click();
		return new DealsPage();
	}
	public TasksPage clickTasksLink() {
		
		linkTask.click();
		return new TasksPage();
	}
}
