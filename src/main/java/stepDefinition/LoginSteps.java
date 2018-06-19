package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Credentials;
import pageobjects.LoginPage;

public class LoginSteps {


	@Given("^user open webpage$")
	public void user_open_webpage() throws Throwable {
		LoginPage.startAPP();

}

	@When("^user insert username$")
	public void user_insert_username() throws Throwable {
		LoginPage.txt_userName().sendKeys(Credentials.username);

	}

	@Then("^user insert password$")
	public void user_insert_password() throws Throwable {
		LoginPage.txt_password().sendKeys(Credentials.password);

	}

	@Then("^user click the button$")
	public void user_click_the_button() throws Throwable {
		LoginPage.btn_login().click();

	}







}
