package com.hrm.steps;

import org.junit.Assert;

import com.hrm.pages.A001LoginPage;
import com.hrm.utils.CommonMethods;
import com.orangehrm.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A001LoginPageSteps extends CommonMethods {
	
	A001LoginPage login=new A001LoginPage();
	
//	@Given("I see OrangeHrm logo")
//	public void i_see_OrangeHrm_logo() {
//	  
//	  boolean isDisplayed=login1.logo.isDisplayed();
//	  Assert.assertTrue(isDisplayed);
//	}
	@Given("I see company logo on login page")
	public void i_see_company_logo_on_login_page() {
	   boolean isDisplayed=login.logo.isDisplayed();
	   Assert.assertTrue(isDisplayed);
	}	
	
	
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
	  sendText(login.userName, "Admin");
	  sendText(login.password, "Hum@nhrm123");
	  
	}

	@When("I click login button")
	public void i_click_login_button() {
	    click(login.loginButton);
	 
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
//		HomePage home=new HomePage();
//		Assert.assertTrue(home.dashboardText.isDisplayed());
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
	   sendText(login.userName, "Test");
	   sendText(login.password,"Test123");
	    
	}

//	@When("I click login button")
//	public void i_click_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}

	@Then("I see error message is displayed")
	public void i_see_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("I enter invalid username and password I see errorMessage")
	public void i_enter_invalid_username_and_password_I_see_errorMessage(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
