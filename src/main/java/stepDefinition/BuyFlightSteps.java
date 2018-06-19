package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Credentials;
import helper.Log;
import pageobjects.BuyFlightPage;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;

public class BuyFlightSteps {


@Given("^user open BuyFlight page$")
public void user_open_BuyFlight_page() throws Throwable {

	LoginPage.startAPP();
	Log.info("Application Started");
	LoginPage.Wait();;
	LoginPage.txt_userName().sendKeys(Credentials.username);
	Log.info("userName inserted");
	LoginPage.txt_password().sendKeys(Credentials.password);
	Log.info("password inserted");
	LoginPage.btn_login().click();
	Log.info("Login button clicked");
}

@When("^user insert first passanger first name$")
public void user_insert_first_passanger_first_name() throws Throwable {
	BuyFlightPage.txt_passFirst0().sendKeys("mike");
	Log.info("First Passenger first name inserted");

}

@Then("^user insert first passanger last name$")
public void user_insert_first_passanger_last_name() throws Throwable {

	BuyFlightPage.txt_passLast0().sendKeys("johns");
	Log.error("First Passenger last name inserted");
}

@Then("^user insert second passanger first name$")
public void user_insert_second_passanger_first_name() throws Throwable {
	BuyFlightPage.txt_passFirst1().sendKeys("hasan");
	Log.warn("Second Passenger first name inserted");

}

@Then("^user insert second passanger last name$")
public void user_insert_second_passanger_last_name() throws Throwable {
	BuyFlightPage.txt_passLast0().sendKeys("rehman");
	Log.fatal("Second Passenger last name inserted");

}



@Then("^user select credit card type$")
public void user_select_credit_card_type() throws Throwable {

	FlightFindPage.selcteItem(BuyFlightPage.slc_creditCard1(), 1);
	Log.info("Credit Card Type is selected");
}

@Then("^user insert credit card number$")
public void user_insert_credit_card_number() throws Throwable {
	BuyFlightPage.txt_creditnumber().sendKeys("1234567896541");
	Log.info("Credit Card number is inserted");

}

@Then("^user insert credit card exp_date_Month$")
public void user_insert_credit_card_exp_date_Month() throws Throwable {

	FlightFindPage.selcteItem(BuyFlightPage.slc_creditMuth(), 10);
	Log.info("Credit Card Expiration month is selected");
}

@Then("^user insert credit card exp_date_year$")
public void user_insert_credit_card_exp_date_year() throws Throwable {

	FlightFindPage.selcteItem(BuyFlightPage.txt_creditYear(), 7);
	Log.info("Credit Card Expiration year is selected");
}



@Then("^user click purchase button$")
public void user_click_purchase_button() throws Throwable {
	BuyFlightPage.btn_buyFlights().click();
	Log.info("Buy flight button clicked");

}
}
