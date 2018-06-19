package testRunner;

import org.eclipse.jetty.util.log.Log;

import action.BuyFlightPageAction;
import action.FlightFindPageAction;
import action.LoginAction;
import action.ReserveFlightPageAction;

public class Runner {

	
		public static void main(String[] args) throws Exception {
			LoginAction.Execute();
			FlightFindPageAction.Execute();
			ReserveFlightPageAction.Execute();
			BuyFlightPageAction.Execute();
		Log.getLog();
		}

}
