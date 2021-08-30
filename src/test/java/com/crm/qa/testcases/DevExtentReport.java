package com.crm.qa.testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DevExtentReport {

	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;
	@BeforeTest
	public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		System.out.println(System.getProperty("user.dir")+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

	@Test
	public void extentReportsDemo1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google"))
		{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}	
		@Test
		public void extentReportsDemo2()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			if(driver.getTitle().equals("Google"))
			{
				test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
				test.log(LogStatus.FAIL, "Test Failed");
			}
	}
	@AfterTest
	public static void endTest()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
	}


}
