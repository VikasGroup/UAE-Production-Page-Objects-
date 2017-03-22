package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class WirecardCheckoutPage extends PageObject{
	
	@FindBy(xpath = ".//*[@id='cardholder']")
	WebElement cardHolder_txt ;

	@FindBy(id = "CardNumber")
	WebElement cardNo_txt ;
	
	@FindBy(id = "CardMonth")
	WebElement month_slc ;
	
	@FindBy(id = "CardYear")
	WebElement year_slc ;
	
	@FindBy(id = "Securecode")
	WebElement secCode_txt ;
	
	@FindBy(id = "Paybutton")
	WebElement next_btn ;
	
	public void entername(String text){
		cardHolder_txt.sendKeys(text);
	}
	
	public void entercardNo(String text){
		cardNo_txt.sendKeys(text);
	}
	
	public void selectmonth(String value){
		 Select month =new Select(month_slc);
		  month.selectByVisibleText(value);
	}
	
	public void selectYear(String value){
		Select year =new Select(year_slc);
		  year.selectByVisibleText(value);
	}
	public void enterSecCode(String text){
		secCode_txt.sendKeys(text);
	}
	
	public void entercardinfo(){
		next_btn.click();
	}
}
