package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class ForPwdCountPgObject extends PageObject {

	@FindBy(xpath = ".//*[@id='form0']/input[3]")
	WebElement count_btn;
	
	public void clickCountinue(){
		count_btn.click();
	}
}
