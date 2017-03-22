package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class ProductsPgObjects extends PageObject {

	
	 @FindBy(xpath= ".//*[@id='productList']/div[2]/div[6]/div/div[1]/a[3]/span")
	 WebElement prod3;
	 
	 @FindBy(xpath=".//*[@id='productList']/div[2]/div[1]/div/div[1]/a[3]/span")
	 WebElement prod2;
	 
	 @FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/a")
	 WebElement cart;
	 
	 @FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[3]/a")
	 WebElement checkout;
	 
	 @FindBy(xpath=".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[2]/div/a/span")
	 WebElement clearprod_btn;
	 
	 @FindBy(xpath= ".//*[@id='productList']/div[2]/section[2]/div/div/div[1]/div/div/div[2]/div/div[4]/div[2]/button[1]")
	 WebElement add2cart_btn;
	 
	 public void clickProd3(){
	  prod3.click();
	 }
	 
	 public void clickProd2(){
	  prod2.click();
	 }
	 public void clickCart(){
	  cart.click();
	 }
	 public void clickCheckOut(){
	  checkout.click();
	 }
	 public void clickclearcart(){
		
		 if (clearprod_btn.isDisplayed()) {
			 clearprod_btn.click();
		} 
		
	 }
	 public void clickAdd2cart(){
		 add2cart_btn.click();
		 }
	}

