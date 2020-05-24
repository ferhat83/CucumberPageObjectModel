package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.utils.SetUp;

public class LoginPage extends SetUp {
	@FindBy(xpath = "")
	WebElement username;
	@FindBy(xpath = "")
	WebElement password;
	@FindBy(xpath = "")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String pageTitle() {
		System.out.println("page title is: " + driver.getTitle());
		return driver.getTitle();

	}

	public void enterUsername(String un) {
		username.sendKeys(un);
	}

	public void enterPassword(String pw) {
		password.sendKeys(pw);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
}
