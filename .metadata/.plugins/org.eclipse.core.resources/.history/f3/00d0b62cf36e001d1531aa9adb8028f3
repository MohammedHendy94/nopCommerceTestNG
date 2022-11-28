package tests;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import pages.SearchResultPage;

public class SearchResultsTests extends HomeRegisteredTests{
	
	   SearchResultPage search;
	   
	   @Test(dependsOnMethods = {"searchingforproduct"}, priority = 1)
	    public void AddProductToCart() {
	        search = new SearchResultPage();
	       search.AddingProduct();
	    }
	   @Test(dependsOnMethods = {"AddProductToCart"}, priority = 2)
	    public void OpenCart() {
	        search = new SearchResultPage();
	       search.GoToshoppingCart();
	       String URL = driver.getCurrentUrl();
		     Assert.isTrue(URL.contains("cart"), "User not navigated to the cart page");
	    }

}