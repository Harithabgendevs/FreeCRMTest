package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	//Page Factory - Object repository
	@FindBy(xpath="//body/div[1]/main[1]/section[1]/a[1]")
	public WebElement signUpBtn;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='phone_number']")
	public WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@id='terms']")
	public WebElement Terms;
	
	@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[1]")
	public WebElement Captcha;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	public WebElement Signup;

	//Initializing the Page Objects:
	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateSignUpPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage signUpBtn(String un, String pwd) throws InterruptedException{
		signUpBtn.click();
		EmailAddress.sendKeys("harithab@gendevs.com");
		PhoneNumber.sendKeys("7780660218");
		Terms.click();
		Captcha.click();
		Signup.click();
		Thread.sleep(1000);
		return new HomePage();
	}
}

