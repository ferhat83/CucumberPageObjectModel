package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.utils.SetUp;

public class HomePage extends SetUp {

	@FindBy(xpath = "")
	WebElement account;
	@FindBy(xpath = "")
	WebElement signIn;

	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {
		System.out.println("page title is: "+driver.getTitle());
		return driver.getTitle();
		
	}
	
	public void clickOnAccount() {
		account.click();

	}

	public void clickOnSignIn() {
		signIn.click();
	}

}
