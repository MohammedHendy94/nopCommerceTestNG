package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bases.Base;

public class SearchResultPage extends Base {
	
	 //Defining Web elements of the page
    WebElement AddToCartBtn = driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
    WebElement ShopCartBtn = driver.findElement(By.xpath("//span[@class='cart-label']"));

    //Defining methods for handling actions on web elements

    public void AddingProduct(){
        AddToCartBtn.click();
    }
    public void GoToshoppingCart(){
        ShopCartBtn.click();
    }

}
