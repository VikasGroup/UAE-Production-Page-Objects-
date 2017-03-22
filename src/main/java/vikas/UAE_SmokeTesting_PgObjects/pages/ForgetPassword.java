package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class ForgetPassword extends PageObject{

	@FindBy(xpath = ".//*[@id='ForgotPasswordVerifyAccountId']")
	WebElement email_txt;
	
	@FindBy(xpath = ".//*[@id='form2']/input[4]")
	WebElement submit_btn;
	
	
	
	public void enterEmail(String text){
		email_txt.sendKeys(text);
	}
	
	public void clickSubmit(){
		submit_btn.click();
	}
	
}
