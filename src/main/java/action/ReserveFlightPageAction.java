package action;

import helper.Log;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;
import pageobjects.ReserverFlightPage;

		public class ReserveFlightPageAction {
	
		
		public static void Execute() throws Exception{
				LoginPage.Wait();
				LoginPage.captureScreenShot();
				FlightFindPage.btnClick(ReserverFlightPage.btn_reserveFlights());
				Log.info("ReserveFlight button clicked");
				
			}
		}





