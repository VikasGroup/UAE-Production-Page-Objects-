package vikas.UAE_SmokeTesting_PgObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class RedeemHealthPgObject extends PageObject {

	@FindBy(xpath = ".//*[@id='productList']/div[2]/div[4]/div/div[1]/a[3]/span")
	WebElement redeem_prod;

	@FindBy(xpath = ".//*[@id='Brand']/ul/li/div/label[1]")
	WebElement redeem_Air;

	@FindBy(xpath = ".//*[@id='mainNavi']/ul/li/a")
	WebElement products_btn;

	@FindBy(partialLinkText = "VTube+")
	WebElement vtube_btn;

	@FindBy(xpath = ".//*[@id='productList']/div[2]/div/div/div[1]/a[3]/span")
	WebElement vtubeprod_btn;

	@FindBy(xpath = ".//*[@id='productList']/div[2]/section[2]/div/div/div[1]/div/div/div[2]/div/div[4]/div[2]/button[1]")
	WebElement vtubeprod_submit;

	public void clickRedeemProducts() {
		redeem_prod.click();
	}

	public void checkProducts() {
		redeem_Air.click();
	}

	public void clickprod() {
		products_btn.click();
	}

	public void clickVtube() {
		vtube_btn.click();
	}

	public void clickVtubeprod() {
		vtubeprod_btn.click();
	}

	public void vtubeSubmit() {
		vtubeprod_submit.click();
	}
}
