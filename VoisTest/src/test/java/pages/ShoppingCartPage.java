package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bases.Base;
import dev.failsafe.internal.util.Assert;

public class ShoppingCartPage extends Base {
	 //Defining Web elements of the page

  public  WebElement AgreetoTermsChkbox = driver.findElement(By.id("termsofservice"));
    WebElement CheckOutBtn = driver.findElement(By.id("checkout"));

    //Defining methods for handling actions on web elements

    public void Agreetoterms(){
        AgreetoTermsChkbox.click();
    }
    public void ClickCheckout(){
        CheckOutBtn.click();
    }

}
