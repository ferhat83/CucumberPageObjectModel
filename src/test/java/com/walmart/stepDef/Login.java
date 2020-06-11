package com.walmart.stepDef;

import org.junit.Assert;

import com.walmart.pages.HomePage;
import com.walmart.pages.LoginPage;
import com.walmart.utils.Generic;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    Generic generic= new Generic();
	HomePage homePage = new HomePage();
	LoginPage loginPage= new LoginPage();

	@Given("^user navigates to walmart application$")
	public void user_navigates_to_walmart_application() throws Throwable {
		generic.navigateTo();
		
	}

	@When("^page title is \"([^\"]*)\"$")
	public void page_title_is(String arg1) throws Throwable {
		Assert.assertEquals(arg1, homePage.pageTitle());
		System.out.println("page title validation success");
	}

	@Then("^user clicks on account$")
	public void user_clicks_on_account() throws Throwable {
		homePage.clickOnAccount();

	}

	@Then("^user clicks on sign in$")
	public void user_clicks_on_sign_in() throws Throwable {
		homePage.clickOnSignIn();

	}

	@Then("^user is landed to login page \"([^\"]*)\"$")
	public void user_is_landed_to_login_page(String arg1) throws Throwable {
		Assert.assertEquals(arg1, loginPage.pageTitle());
		System.out.println("page title validation success");

	}

	@Then("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
		loginPage.enterUsername(arg1);

	}

	@Then("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);
	}

	@Then("^user clicks on login btn$")
	public void user_clicks_on_login_btn() throws Throwable {
		loginPage.clickOnLoginButton();
	}

	@Then("^user should see \"([^\"]*)\" in username field$")
	public void user_should_see_in_username_field(String arg1) throws Throwable {
//		Assert.assertEquals(arg1, loginPage.getErrorMessage1());
		System.out.println(arg1);
		System.out.println(loginPage.checkPresence(arg1));
		Assert.assertTrue(loginPage.checkPresence(arg1));

	}

	@Then("^use should see \"([^\"]*)\" in password field$")
	public void use_should_see_in_password_field(String arg1) throws Throwable {
//		Assert.assertEquals(arg1, loginPage.getErrorMessage2());
		System.out.println(arg1);
		System.out.println(loginPage.checkPresence(arg1));
		Assert.assertTrue(loginPage.checkPresence(arg1));
	}

}
