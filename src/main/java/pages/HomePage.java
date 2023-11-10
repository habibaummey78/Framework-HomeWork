package pages;

import org.bouncycastle.oer.its.ieee1609dot2dot1.ButterflyExpansion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Skip to Main Content']")
	WebElement skipToMainContentElement;
	private WebElement skipToMainContent;

	public void clickSkipToMainContent() throws InterruptedException {
		Thread.sleep(3000);

	}
}
