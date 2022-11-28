package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Bases.Base;

public class SearchResultPage extends Base {
	
	 //Defining Web elements of the page
    WebElement AddToCartBtn = driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
    WebElement ShopCartBtn = driver.findElement(By.xpath("//span[@class='cart-label']"));
   public WebElement ShopCartLble = driver.findElement(By.xpath("//span[@class='cart-qty']"));
   public WebElement NotifBar = driver.findElement(By.id("bar-notification"));


    //Defining methods for handling actions on web elements

    public void AddingProduct(){
        AddToCartBtn.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(NotifBar));
    }
    
    public void GoToshoppingCart(){
    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.invisibilityOf(NotifBar));
        ShopCartBtn.click();
    }

}
