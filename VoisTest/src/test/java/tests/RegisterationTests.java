package tests;
import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.RegisterationPage;
import testdata.TestData;

public class RegisterationTests extends HomeTests {
	
	RegisterationPage Regs;
		
	TestData tstdata  = new TestData("C:\\Users\\Candle_Store\\Desktop\\VOIS_Testng\\VoisTest\\TestData\\nopCommerce.xlsx","Registeration");
	

	@Test(dependsOnMethods = {"Registeration","clickregister"}, priority = 1)
	    public void UserChooseGender(){
		
		    Regs = new RegisterationPage();
	        Regs.chooseGender(tstdata.getGender());
	    }
	
	@Test ( dependsOnMethods = {"UserChooseGender"}, priority = 2)
	    public void fillFirstnam_lastName() {
	        Regs = new RegisterationPage();
	        Regs.Filling_Fname_Lname(tstdata.getfirstname(), tstdata.getlastname());
	    }
	
	@Test ( dependsOnMethods = {"fillFirstnam_lastName"}, priority = 3)
	    public void selectBirthdaysBirthmonthBirthyear() {
	        Regs = new RegisterationPage();	        
			String Bday = String.valueOf(tstdata.getbirthday()); 
	        String Bmonth = String.valueOf(tstdata.getbirmonth()); 
	        String Byear = String.valueOf(tstdata.getbirthyear()); 
	        Regs.SelectingBirthday(Bday, Bmonth, Byear);
	    }
	
	@Test (dependsOnMethods = {"selectBirthdaysBirthmonthBirthyear"}, priority = 4)
	    public void fillemailaddress() {
	        Regs = new RegisterationPage();
	        Regs.SettingEmailAddress(tstdata.getemail());
	    }
	
	@Test (  dependsOnMethods = {"fillemailaddress"}, priority = 5)
	    public void fillthecompanyname() {
	        Regs = new RegisterationPage();
	        Regs.SettingCompanyName(tstdata.getcompanyname());
	    }
	
	@Test ( dependsOnMethods = {"fillthecompanyname"},priority = 6)
	    public void fillPasswordandConfirm_password() {
	        Regs = new RegisterationPage();
	        Regs.Setting_Pssword(tstdata.getpassword(), tstdata.getconfirmpassword());
	    }
	
	@Test (dependsOnMethods = {"fillPasswordandConfirm_password"}, priority = 7)
	    public void clickontheregisterbutton() {
	        Regs = new RegisterationPage();
	        Regs.Submitting_Registeration();
		    String URL = driver.getCurrentUrl();
	        Assert.isTrue(URL.contains("registerresult"), "User could not Registered");
	    }
	
}
