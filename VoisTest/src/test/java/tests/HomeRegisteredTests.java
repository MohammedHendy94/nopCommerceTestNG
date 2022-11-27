package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.HomeRegisteredPage;
import testdata.TestData;

public class HomeRegisteredTests extends RegisterationTests {
	
	HomeRegisteredPage homreg;
	
	TestData tstdata  = new TestData("C:\\Users\\Candle_Store\\Desktop\\VOIS_Testng\\VoisTest\\TestData\\nopCommerce.xlsx","Search");

	
	@Test (dependsOnMethods = {"clickontheregisterbutton"})
	public void searchingforproduct() {
		homreg = new HomeRegisteredPage();
		homreg.SearchingForProduct(tstdata.getproductname());
		 String URL = driver.getCurrentUrl();
	     Assert.isTrue(URL.contains("windows+8+Pro"), "User not navigated to search result page");
	}
	

}
