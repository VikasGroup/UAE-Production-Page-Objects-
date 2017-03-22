package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class Registration extends PageObject {
	
	@FindBy(id = "ReferrerID")
	WebElement referrerID_txt;
	
	@FindBy(id = "Nature")
	WebElement regType_slc ;
	
	@FindBy(id = "Title")
	WebElement title_slc ;
	
	@FindBy(id = "FirstName")
	WebElement fName_txt ;
	
	@FindBy(id= "LastName")
	WebElement lName_txt;
	
	@FindBy(id = "datepicker")
	WebElement datePick_txt ;
	
	@FindBy(id= "MobileNo")
	WebElement mobile_txt ;
	
	@FindBy(id = "Email")
	WebElement email_txt;
	
	@FindBy(id = "Email2")
	WebElement reEmail_txt ;
	
	@FindBy(id = "Password")
	WebElement pwd_txt;
	
	@FindBy(id = "Password2")
	WebElement rePwd_txt;
	
	@FindBy(id = "AddressLine1")
	WebElement address_txt;
	
	@FindBy(id = "City")
	WebElement town_txt ;

	@FindBy(id = "ZipCode")
	WebElement zip_txt ;
	
	@FindBy(id = "CompanyName")
	WebElement comName_txt ;
	
	@FindBy(id = "ContactPerson")
	WebElement contPer_txt ;
	
	@FindBy(id = "OtherPosition")
	WebElement position_txt ;
	
	@FindBy(xpath = ".//*[@id='registration-details-form']/div[20]/button")
	WebElement continue_btn ;
	
	@FindBy(xpath = ".//*[@id='registration-terms-form']/div[1]/div/label/input")
	WebElement accept_chk;
	
	@FindBy(xpath = ".//*[@id='registration-terms-form']/div[2]/button")
	WebElement accept_btn;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div/input")
	WebElement ecard_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[3]/div/input")
	WebElement ecardPin_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[4]/a")
	WebElement validate_btn;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[1]/div/input")
	WebElement ecardreg_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[2]/div/input")
	WebElement ecardPinreg_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[3]/a")
	WebElement validatereg_btn;
	
	@FindBy(xpath = ".//*[@id='subCollapseOne']/div/div[3]/button[2]")
	WebElement ecardConf_btn;
	
	@FindBy(xpath = ".//*[@id='subHeadingTwo']/h4/a/span")
	WebElement cc_rbtn;
	
	@FindBy(id = "CompanyName" )
	WebElement CompanyName_txt;
	
	@FindBy(id = "ContactPerson" )
	WebElement ContactPerson_txt;
	
	@FindBy(id = "OtherPosition" )
	WebElement OtherPosition_txt;
	
	@FindBy(xpath = ".//*[@id='registration-details-form']/div[15]/button" )
	WebElement countRetail_btn;
	
	public void enterRefID(String text){
		referrerID_txt.sendKeys(text);
	} 
	public void selectRegType(String text){
		Select RegType =new Select(regType_slc);
		RegType.selectByVisibleText(text);
	}
	public void selectTitle(String text){
		Select title =new Select(title_slc);
		title.selectByVisibleText(text);
	}
	public void enterFname(String text){
		fName_txt.sendKeys(text);
	}
	public void enterLname(String text){
		lName_txt.sendKeys(text);
	}
	public void enterBday(String text){
		datePick_txt.sendKeys(text);
	}
	public void enterMobil(String text){
		mobile_txt.sendKeys(text);
	}
	public void enterEmail(String text){
		email_txt.sendKeys(text);
	}
	public void enterReEmail(String text){
		reEmail_txt.sendKeys(text);
	}
	public void enterPWD(String text){
		pwd_txt.sendKeys(text);
	}
	public void reEnterPWD(String text){
		rePwd_txt.sendKeys(text);
	}
	public void enterAdd(String text){
		address_txt.sendKeys(text);
	}
	public void enterCity(String text){
		town_txt.sendKeys(text);
	}
	public void enterZip(String text){
		zip_txt.sendKeys(text);
	}
	public void clickCount(){
		continue_btn.click();
	}
	public void checkAccept(){
		accept_chk.click();
	}
	public void clickAccept(){
		accept_btn.click();
	}
	public void enterEcard(String text){
		ecard_txt.sendKeys(text);
	}
	public void enterEcardPin(String text){
		ecardPin_txt.sendKeys(text);
	}
	public void clickValidate(){
		validate_btn.click();
	}
	public void clickEcardCon(){
		ecardConf_btn.click();
	}
	public void enterCompanyName(String text){
		CompanyName_txt.sendKeys(text);
	}
	public void enterContactPerson(String text){
		ContactPerson_txt.sendKeys(text);
	}
	public void enterOtherPosition(String text){
		OtherPosition_txt.sendKeys(text);
	}
	public void clickcountRetail(){
	countRetail_btn.click();
	}
	
	public void enterREGEcard(String text){
		ecardreg_txt.sendKeys(text);
	}
	public void enterREGEcardPin(String text){
		ecardPinreg_txt.sendKeys(text);
	}
	public void clickREGValidate(){
		validatereg_btn.click();
	}
}









