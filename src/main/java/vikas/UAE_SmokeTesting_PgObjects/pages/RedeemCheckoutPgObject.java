package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class RedeemCheckoutPgObject extends PageObject {
	
	@FindBy(xpath= ".//*[@id='checkout-details-form']/div/div[3]/div[1]/label/input")
	 WebElement tandc_check;
	
	@FindBy(xpath= ".//*[@id='checkout-details-form']/div/div[6]/a[2]")
	 WebElement checkout_btn;
	 
	@FindBy(xpath= ".//*[@id='checkout-shipping-form']/div/div[3]/a")
	 WebElement countinue_btn;
	 
	@FindBy(xpath= ".//*[@id='collapseFour']/div/div[2]/div[2]/a")
	 WebElement confirm_btn;
	
	 public void checkTandCs(){
		tandc_check.click();
		 }
	 
	 public void clickCheckOut(){
		checkout_btn.click();
		}
	 public void clickCountinue(){
			countinue_btn.click();
			}
	 
	 public void clickConfirm(){
			confirm_btn.click();
			}
}
