package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Bases.Base;
import dev.failsafe.internal.util.Assert;

public class CheckOutPage extends Base {
	
	
	  //Defining Web elements of the page

  public   WebElement CountryDdl = driver.findElement(By.id("BillingNewAddress_CountryId"));
  public   WebElement CityTxt = driver.findElement(By.id("BillingNewAddress_City"));
  public   WebElement Addrress1Txt = driver.findElement(By.id("BillingNewAddress_Address1"));
  public   WebElement ZipcodeTxt = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
  public   WebElement phoneNumberTxt = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
  public   WebElement Continue1Btn = driver.findElement(By.xpath("(//button[@name='save'])[1]"));
 

    //Defining the methods that handles actions on web elements

    public void FillingBillingAddress(String country, String city, String address1, String zipcode, String phone){
        Select selectCountry = new Select(CountryDdl);
        selectCountry.selectByValue(country);
        CityTxt.sendKeys(city);
        Addrress1Txt.sendKeys(address1);
        ZipcodeTxt.sendKeys(zipcode);
        phoneNumberTxt.sendKeys(phone);
        Continue1Btn.click();
    }

    public static void SelectingShippingMethod(String shipmethod){
        WebElement GroundOptionRbtn = driver.findElement(By.id("shippingoption_0"));
        WebElement NextDayAirOptionRbtn = driver.findElement(By.id("shippingoption_1"));
        WebElement SecondDayAirOptionRbtn = driver.findElement(By.id("shippingoption_2"));
        WebElement Continue2Btn = driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
        switch (shipmethod){
            case "Ground ($0.00)":
                GroundOptionRbtn.click();
                break;
            case "Next Day Air ($0.00)":
                NextDayAirOptionRbtn.click();
            case "2nd Day Air___Shipping.FixedByWeightByTotal":
                SecondDayAirOptionRbtn.click();
        }
        Continue2Btn.click();
    }
    public static void SelectingpaymentMethod(){
        WebElement Continue3Btn = driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        Continue3Btn.click();
        WebElement Continue4Btn = driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        Continue4Btn.click();
    }
    public static void ConfirmingOrder() {
        WebElement Continue5Btn = driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
        Continue5Btn.click();
    }
    public static void CompletingOrder(){
        WebElement OrderNumberLble = driver.findElement(By.xpath("//div[@class='order-number']"));
        Assert.isTrue(OrderNumberLble.isDisplayed(),"Order wasn't placed successfully");
    }
	

}
