package tests;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.ShoppingCartPage;

public class ShoppingCartTests extends SearchResultsTests {
	
	ShoppingCartPage shopcart;
	
@Test(dependsOnMethods = {"OpenCart"}, priority = 1) 
    public void AgreeToTermsOfService (){
      shopcart =new ShoppingCartPage();
      shopcart.Agreetoterms();
      Assert.isTrue(shopcart.AgreetoTermsChkbox.isSelected(),"Agree to terms not checked");
    }


@Test(dependsOnMethods = {"AgreeToTermsOfService"}, priority = 2) 
    public void ClickCheckOut (){
        shopcart =new ShoppingCartPage();
        shopcart.ClickCheckout();
        String URL = driver.getCurrentUrl();
	     Assert.isTrue(URL.contains("onepagecheckout"), "User not navigated to the checkout page");
   }
      }


