package com.crm.qa.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	SignUpPage signuppage;
	HomePage homePage;
	
	public SignUpPageTest(){
		super();
	}
	
	@BeforeMethod
	
	public void setUp(){
		initialization();
		signuppage = new SignUpPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = signuppage.validateSignUpPageTitle();
		AssertJUnit.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test(priority=2)
	public void signupTest() throws InterruptedException{
		homePage = signuppage.signUpBtn(prop.getProperty("EmailAddress"), prop.getProperty("PhoneNumber"));
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
