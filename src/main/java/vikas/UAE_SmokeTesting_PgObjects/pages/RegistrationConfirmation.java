package vikas.UAE_SmokeTesting_PgObjects.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class RegistrationConfirmation extends PageObject{
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[4]/div[3]/p")
	WebElement welcome_txt;
	
	public String readName(){
		System.out.println(welcome_txt.getText());
		 return welcome_txt.getText();
		
	}	

}
