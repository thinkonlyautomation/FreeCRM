package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory-Object Repository 
	@FindBy(name="username")
	WebElement userName;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement imgLogo;
	
	//initialize page Objects
	public LoginPage() {
		
		PageFactory.initElements(driver,this);

	}
	//Actions on Page which we need to automate
	public String getLoginPageTitle() {

		return driver.getTitle();

	}
	public Boolean validateLogo() {
		return imgLogo.isDisplayed();

	}
	public HomePage login(String usr,String pwd) {
		userName.sendKeys(usr);
		passWord.sendKeys(pwd);
		loginBtn.click();

		return new HomePage();
	}



}
