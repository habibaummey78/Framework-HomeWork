package pagesTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void clickSkipToMainContentTest() throws InterruptedException {

		homepage.clickSkipToMainContent();

	}

}
