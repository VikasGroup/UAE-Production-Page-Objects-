package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.thoughtworks.selenium.webdriven.commands.Click;

import net.serenitybdd.core.pages.PageObject;

public class VODashboard extends PageObject{
	
	@FindBy(xpath= ".//*[@id='mainNavi']/ul/li[1]/a")
	WebElement product_link;
	
	@FindBy(partialLinkText = "LifeQode")
	WebElement LifeQode_link;
	
	@FindBy(partialLinkText = "HomePure")
	WebElement HomePure_link;
	
	@FindBy(partialLinkText = "VTube+")
	WebElement vtube_link;
	
	@FindBy(partialLinkText = "Q-breaks")
	WebElement Qbreak_link;
	
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[4]/div[2]/a")
	WebElement VO;
	
	@FindBy(id = "eRdmStore")
	WebElement redeem_btn;
	
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[1]/div/a/span[1]")
	WebElement shpcart_btn;
	
	@FindBy(xpath = ".//*[@id='header']/div[1]/div[2]/div[1]/div/div/div[2]/div/a/span")
	WebElement prodDel_btn;
	
	public void clickproduct(){
		product_link.click();
	}
	
	public void clicklifeQode(){
		LifeQode_link.click();
	}
	
	public void clickHomePure(){
		HomePure_link.click();
	}
	
	public void clickVO(){
		VO.click();
	}
	public void clickVTube(){
		vtube_link.click();
	}
	public void clickQBreak(){
		Qbreak_link.click();
	}
	public void clickRedeem(){
		redeem_btn.click();
	}
	
	public void emptycart() throws InterruptedException{
		shpcart_btn.click();
		if (prodDel_btn.isEnabled()) {
			prodDel_btn.click();
			Thread.sleep(2000);
			shpcart_btn.click();
		} else {
			shpcart_btn.click();
		}
	}
		
	}

