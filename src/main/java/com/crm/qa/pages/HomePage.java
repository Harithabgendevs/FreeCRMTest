package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Haritha Bussareddy')]")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/div[3]/a[1]/i[1]")
	WebElement contactsLogo;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]/i[1]")
	WebElement newContactLink;
	

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactsLogo).build().perform();
		contactsLink.click();
		return new ContactsPage();
	}

	public void clickOnNewContactLink() {
		// TODO Auto-generated method stub
		
	}
	
	/*public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage();
	}*/


}
