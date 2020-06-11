package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.utils.Generic;



public class HomePage extends Generic {

	@FindBy(xpath = "//span[text()='Account']/parent::span[@class='b_a b_r']")
	WebElement account;
	@FindBy(xpath = "//div[text()='Sign In']")
	WebElement signIn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {
		System.out.println("page title is: " + driver.getTitle());
		return driver.getTitle();

	}

	public void clickOnAccount() {
		account.click();

	}

	public void clickOnSignIn() {
		signIn.click();
	}

}
