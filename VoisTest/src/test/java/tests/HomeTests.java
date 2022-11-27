package tests;

import org.testng.annotations.Test;
import Bases.Base;
import dev.failsafe.internal.util.Assert;
import pages.HomePage;

public class HomeTests extends Base {
	HomePage hompag;
	
	@Test
	public void Registeration() {
		launch_browser();
	}
	
	@Test
	public void clickregister() {
	     hompag = new HomePage();
	    hompag.ClickondRegister();
	    String URL = driver.getCurrentUrl();
	    Assert.isTrue(URL.contains("register"), "User is not in the registration page");
	    }
	

}
