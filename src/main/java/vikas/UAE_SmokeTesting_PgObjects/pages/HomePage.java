package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{

	@FindBy(xpath = ".//*[@id='header']/div/div[4]/div[2]/a")
	WebElement login_link;
	
	@FindBy(linkText = "Products" )
	WebElement products_link;
	
	public void clickLogReg(){
		login_link.click();
	}
	
	public void clickProduct(){
		products_link.click();
	}
}
