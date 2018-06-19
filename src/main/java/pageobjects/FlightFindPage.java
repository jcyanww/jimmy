package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFindPage extends BasePage{
		static WebElement element = null;
	public FlightFindPage(WebDriver driver) {
		super(driver);

}

		public static WebElement slc_Pass() {
			try {
				element = driver.findElement(By.name("passcount"));
			} catch (Exception e) {
				e.getStackTrace();
				
			}
			return element;
		}


		public static WebElement slc_toPort() {
			try {
				element = driver.findElement(By.name("toPort"));
			} catch (Exception e) {
				e.getStackTrace();
				
			}
			return element;
		}

		public static WebElement slc_airLine() {
			try {
				element = driver.findElement(By.name("airline"));
			} catch (Exception e) {
				e.getStackTrace();
				
			}
			return element;
		}

		public static WebElement btn_FindFight() {
			try {
				element = driver.findElement(By.name("FindFlight"));
			} catch (Exception e) {
				e.getStackTrace();
				
			}
			return element;
		}
		
		public static void selcteItem(WebElement element,int index) {
			Select slc = new Select(element);
			slc.selectByIndex(index);
			
		}

		public static void btnClick(WebElement element) {
			element.click();
		}



}




