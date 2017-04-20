package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class CheckoutPgObject extends PageObject {

	@FindBy(xpath=".//*[@id='checkout-details-form']/div/div[3]/div[2]/div[1]/label/input")
	 WebElement chkout1;
	
	@FindBy(xpath=".//*[@id='checkout-details-form']/div/div[3]/div[3]/label/input")
	 WebElement chkout2;
	
	@FindBy(xpath=".//*[@id='checkout-details-form']/div/div[3]/div[5]/label/input")
	 WebElement chkout3;
	
	@FindBy(xpath= ".//*[@id='checkout-details-form']/div/div[6]/a[2]")
	 WebElement chkoutsp;
	
	@FindBy(xpath=".//*[@id='checkout-shipping-form']/div/div[5]/a")
	 WebElement count_btn;
	
	@FindBy(xpath=".//*[@id='delivery-8800001541']")
	 WebElement deliveryOption;
	
	@FindBy(xpath=".//*[@id='bv-allocation-table']/div[4]/div[4]/button")
	 WebElement bvAllo_btn;
	
	@FindBy(xpath=".//*[@id='collapseThree']/div[1]/div[3]/button")
	 WebElement proPay_btn;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[1]/div/input")
	WebElement ecard_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[2]/div/input")
	WebElement ecardPin_txt;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[2]/div[3]/a")
	WebElement validate_btn;
	
	@FindBy(xpath = ".//*[@id='ecard-payment-form']/div[5]/a[2]")
	WebElement ecardConf_btn;
	
	@FindBy(xpath = ".//*[@id='subHeadingTwo2']/h4/a/span")
	WebElement cc_rbtn;
	
	@FindBy(xpath = ".//*[@id='subCollapseTwo2']/div/a/img")
	WebElement ccImg_btn;
	
	@FindBy(xpath = ".//*[@id='subCollapseThree2']/div/div[2]/div[2]/div/input")
	WebElement QApin_txt;
	
	@FindBy(xpath = ".//*[@id='subCollapseThree2']/div/div[4]/label/input")
	WebElement QAtc_chk;
	
	@FindBy(xpath = ".//*[@id='subCollapseThree2']/div/div[4]/div/button")
	WebElement QACon_btn;
	
	@FindBy(xpath = ".//*[@id='subHeadingThree2']/h4/a/span")
	WebElement QAcc_btn;
	
	public void check1(){
		chkout1.click();
	}
	public void check2(){
		chkout2.click();
	}
	public void check3(){
		chkout3.click();
	}
	public void clickcount_btn(){
		count_btn.click();
	}
	public void clickChkPro(){
		chkoutsp.click();
	}
	 public void selectDeliveryOption(String value){
		  Select dilio=new Select(deliveryOption);
		  dilio.selectByVisibleText(value);
	}
	public void clickProceed(){
		 proPay_btn.click();
	} 
	public void disributrBV(){
		bvAllo_btn.click();
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
	public void clickCC(){
		cc_rbtn.click();
	}
	public void clickCCIMG(){
		ccImg_btn.click();	
	}
	public void clickQAcc(){
		QAcc_btn.click();	
	}
	public void enterQAPin(String text){
		QApin_txt.sendKeys(text);
	}
	public void chkQatc(){
		QAtc_chk.click();
	}
	public void clkQaConfirm(){
		QACon_btn.click();
	}
}
