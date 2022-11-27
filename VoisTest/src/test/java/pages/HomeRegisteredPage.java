package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bases.Base;

public class HomeRegisteredPage extends Base {
	
	
    WebElement SearchTxt = driver.findElement(By.id("small-searchterms"));
    WebElement SearchBtn = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));


	 public void SearchingForProduct(String prodname){
	        SearchTxt.sendKeys(prodname);
	        SearchBtn.click();
	 }

}
