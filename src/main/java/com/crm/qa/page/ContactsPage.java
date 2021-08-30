package com.crm.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contaxtsLabel;
	@FindBy(name="title")
	WebElement titleEl;
	@FindBy(id="first_name")
	WebElement firstName;
	@FindBy(id="surname")
	WebElement LastName;
	@FindBy(name="client_lookup")
	WebElement company;
	@FindBy(xpath="//input[@type='submit' and @class='button']")
	WebElement savebtn;
	//initialize page Objects
	public ContactsPage() {

		PageFactory.initElements(driver,this);

	}
	
	public String getContactsLabel() {
		
		return contaxtsLabel.getText();
		
	}
	
	
	public void selectContact() {
		driver.findElement(By.xpath("//a[text()='Amit Bansal']/../preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public void createNewContact(String title,String ftName,String ltName,String comp) {
		Select select=new Select(titleEl);
		select.selectByVisibleText(title);
		firstName.sendKeys(ftName);
		LastName.sendKeys(ltName);
		company.sendKeys(comp);
		savebtn.click();
	}

}
