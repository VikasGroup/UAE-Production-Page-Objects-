package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	
	@FindBy(xpath = ".//*[@id='UserName']")
	WebElement username_txt;
	
	@FindBy(xpath = ".//*[@id='Password']")
	WebElement password_txt ;
	
	@FindBy(xpath = ".//*[@id='form2']/input[3]")
	WebElement login_btn;
	
	@FindBy(xpath = ".//*[@id='form2']/p/a")
	WebElement pwdforget_link;
	
	@FindBy(xpath = ".//*[@id='LoginFormBody']/div[1]/div/div[2]/div/div[1]/a")
	WebElement retailReg_btn;
	
	@FindBy(xpath = ".//*[@id='LoginFormBody']/div[1]/div/div[2]/div/div[2]/a")
	WebElement IRReg_btn;
	
	public void enterUserName(String text){
		username_txt.sendKeys(text);;
	}
	public void enterpwd(String text){
		password_txt.sendKeys(text);
	}
	public void clickLogin(){
		login_btn.click();
	}
	public void clickForPwd(){
		pwdforget_link.click();
	}
	public void clickRetailReg(){
		retailReg_btn.click();
	}
	public void clickIRReg(){
		IRReg_btn.click();
	}
}
