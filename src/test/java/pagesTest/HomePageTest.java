package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true)
	public void clickSkipToMainContentTest() throws InterruptedException {
		homepage.clickSkipToMainContent();
	}

	@Test(enabled = false)
	public void clickUserIdTest() {
		homepage.clickUserId();
	}

	@Test(enabled = false)
	public void clickPasswordIdTest() {
		homepage.clickPasswordId();
	}

	@Test
	public void clickLoginTest() {
		homepage.clickLogin();
	}

	@Test(enabled = false)
	public void clickTroubleShootIdPassTest() {
		homepage.clickTroubleShootIdPass();
	}
//Logo validated

	@Test(enabled = false)
	public void clickLogoTitleTest() {
		try {
			homepage.clickLogoTitle();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//Sendkeys method is called

	@Test(enabled = false)
	public void inputInLoginFieldTest() {
		homepage.inputInLoginField();
	}

	// Common Actions methods are called

	@Test(enabled = false)
	public void nullPointerExceptionTest() throws InterruptedException {
		homepage.clickTroubleShootIdPass();
	}

	@Test(enabled = false)
	public void clickingAndSendingKeysTest() throws InterruptedException {
		homepage.clickingAndSendingKeys();
	}

	// use of link test

	@Test(enabled = false)
	public void linkText() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText("Please enter ID.")).click();
		Thread.sleep(4000);
	}

	// use partial Link test

	@Test(enabled = true)
	public void partialLinkText() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("ter Password")).click();
		Thread.sleep(4000);
	}

}
