package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bases.Base;



import dev.failsafe.internal.util.Assert;
import pages.SearchResultPage;

public class SearchResultsTests extends HomeRegisteredTests{
	
	   SearchResultPage search;
	   
	   @Test(dependsOnMethods = {"searchingforproduct"}, priority = 1)
	    public void AddProductToCart() {
	        search = new SearchResultPage();
	       search.AddingProduct();
	       Assert.isTrue(search.ShopCartLble.getText().contains("1"), "Item is not added to the cart please check");
	       Assert.isTrue(search.NotifBar.isDisplayed(), "item not added");  
	       System.out.println(search.ShopCartLble.getText());
	    }
	   
	   @Test(dependsOnMethods = {"AddProductToCart"}, priority = 2)
	    public void OpenCart() {
	        search = new SearchResultPage();
	       search.GoToshoppingCart();
	       String URL = driver.getCurrentUrl();
		   Assert.isTrue(URL.contains("cart"), "User not navigated to the cart page");

	    }

}