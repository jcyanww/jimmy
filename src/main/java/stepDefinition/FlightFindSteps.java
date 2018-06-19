package stepDefinition;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Credentials;
import helper.Log;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;

public class FlightFindSteps {

	@Given("^user open FlightFind page$")
	public void user_open_FlightFind_page() throws Throwable {

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

	@When("^user select passanger number$")
	public void user_select_passanger_number() throws Throwable {
		FlightFindPage.selcteItem(FlightFindPage.slc_Pass(), 1);
		Log.info("Passenger count Selected");

	}

	@Then("^user select to Port$")
	public void user_select_to_Port() throws Throwable {
		FlightFindPage.selcteItem(FlightFindPage.slc_toPort(), 6);
		Log.info("Departure port selected");
		FlightFindPage.selcteItem(FlightFindPage.slc_toPort(), 3);
		Log.info("Destination port selected");


	}

	@Then("^user select airline$")
	public void user_select_airline() throws Throwable {
		FlightFindPage.selcteItem(FlightFindPage.slc_airLine(), 1);
		Log.info("Airline Company Selected");

	}

	@Then("^user click the continue$")
	public void user_click_the_continue() throws Throwable {
		FlightFindPage.btnClick(FlightFindPage.btn_FindFight());
		Log.info("Continue Button clicked");

	}





	}




	
	

