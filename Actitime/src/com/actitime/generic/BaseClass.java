package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}

}
