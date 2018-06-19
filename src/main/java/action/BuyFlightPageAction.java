package action;

import helper.Log; 
import pageobjects.BuyFlightPage;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;
import pageobjects.ReserverFlightPage;

public class BuyFlightPageAction {


	public static void Execute() throws Exception {
		LoginPage.Wait();
		BuyFlightPage.txt_passFirst0().sendKeys("mike");
		Log.info("First Passenger first name inserted");
		BuyFlightPage.txt_passLast0().sendKeys("johns");
		Log.error("First Passenger last name inserted");
		BuyFlightPage.txt_passFirst1().sendKeys("hasan");
		Log.warn("Second Passenger first name inserted");
		BuyFlightPage.txt_passLast0().sendKeys("rehman");
		Log.fatal("Second Passenger last name inserted");
		FlightFindPage.selcteItem(BuyFlightPage.slc_creditCard1(), 1);
		Log.info("Credit Card Type is selected");
		BuyFlightPage.txt_creditnumber().sendKeys("1234567896541");
		Log.info("Credit Card number is inserted");
		FlightFindPage.selcteItem(BuyFlightPage.slc_creditMuth(), 10);
		Log.info("Credit Card Expiration month is selected");
		FlightFindPage.selcteItem(BuyFlightPage.txt_creditYear(), 7);
		Log.info("Credit Card Expiration year is selected");
		LoginPage.captureScreenShot();
		BuyFlightPage.btn_buyFlights().click();
		Log.info("Buy flight button clicked");
		ReserverFlightPage.tearDown();
	}
}








