package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.inputText;

import java.security.PublicKey;

import javax.xml.xpath.XPath;

import org.bouncycastle.oer.its.ieee1609dot2dot1.ButterflyExpansion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// WebElements are created

	@FindBy(xpath = "//a[text()='Skip to Main Content']")
	WebElement skipToMainContent;

	@FindBy(xpath = " //input[@id= 'remIdChkYN']")
	WebElement userId;

	@FindBy(xpath = " //input[@id = 'iptLgnPlnPD']")
	WebElement passwordId;

	@FindBy(className = "main-inner")
	WebElement login;

	@FindBy(xpath = "//a[text() = 'Trouble getting your account ID?']")
	WebElement troubleShootIdPass;

	@FindBy(xpath = "//div[@class = 'gnb-promo-text']")
	WebElement logoTitle;

	// methods are created from WebElements

	public void clickSkipToMainContent() throws InterruptedException {
		skipToMainContent.click();
		Thread.sleep(3000);
	}

	public void clickUserId() {
		userId.click();
	}

	public void clickPasswordId() {
		passwordId.click();
	}

	public void clickLogin() {
		login.click();
	}

	public void clickTroubleShootIdPass() {
		troubleShootIdPass.click();
	}

	public void clickLogoTitle() throws InterruptedException {
		logoTitle.click();
		Thread.sleep(5000);
	}
	// Sendkeys method is created here

	public void inputInLoginField() {
		userId.sendKeys("habibaummey78@gmail.com");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// common action methods are created here for clicking and sending keys
	public void clickingAndSendingKeys() throws InterruptedException {
		inputText(userId, "habibaummey78@gmail.com");
		inputText(passwordId, "Lifeissweet1@");
		Thread.sleep(3000);
		clickElement(login);
		Thread.sleep(4000);
	}
}
