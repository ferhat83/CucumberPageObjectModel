package com.walmart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.utils.Generic;

public class LoginPage extends Generic {
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit'and text()='Sign in']")
	WebElement loginButton;
	@FindBy(xpath = "//div[@class='form-field required error']//span[@class='span-error']")
	WebElement errorMessage;
	@FindBy(xpath = "//div[@class='form-field required undefined password-field error']//span[@class='span-error']")
	WebElement errorMessage2;
	
	
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
	public boolean checkPresence(String text) {
		System.out.println(driver.getPageSource());
		boolean flag = false;
		if(driver.getPageSource().contains(text)) {
			flag = true;
			return flag;
		}
		return flag;
	}
	public String  getErrorMessage1() {
		String message1 = errorMessage.getText();
		System.out.println("error message on email : "+message1);
		return message1;
	}
	public String getErrorMessage2() {
		String message2 = errorMessage2.getText();
		System.out.println("error message on password : "+ message2);
		return message2;
	}
}
