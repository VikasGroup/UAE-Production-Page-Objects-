package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class AnonymouspurchaseReg extends PageObject{

	@FindBy(xpath = ".//*[@id='registration-terms-form']/div[1]/div/label/input")
	WebElement tcRetail_chk;
	
	@FindBy(xpath = ".//*[@id='registration-terms-form']/div[2]/button")
	WebElement tcConfirm_btn;
	
	public void checktcRetail(){
		tcRetail_chk.click();
	}
	public void clicktcConfirm(){
		tcConfirm_btn.click();
	}
}
