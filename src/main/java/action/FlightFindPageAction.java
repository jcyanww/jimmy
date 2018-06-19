package action;

import helper.Log;
import pageobjects.FlightFindPage;  
import pageobjects.LoginPage;

public class FlightFindPageAction {
	
	public static void Execute() throws Exception{

		LoginPage.Wait();
	

		FlightFindPage.selcteItem(FlightFindPage.slc_Pass(), 1);
		Log.info("Passenger count Selected");
		FlightFindPage.selcteItem(FlightFindPage.slc_toPort(), 6);
		Log.info("Departure port selected");
		FlightFindPage.selcteItem(FlightFindPage.slc_toPort(), 3);
		Log.info("Destination port selected");
		FlightFindPage.selcteItem(FlightFindPage.slc_airLine(), 1);
		Log.info("Airline Company Selected");
		LoginPage.captureScreenShot();
		FlightFindPage.btnClick(FlightFindPage.btn_FindFight());
		Log.info("Continue Button clicked");
	}
}

	
	


