package Blocks;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.CommonOps;

public class VerificationsBlocks extends CommonOps {

	public static void verifyElementIsDisplayed(WebElement element) {
		try {
			Assert.assertNotNull(element, "Webelement is not null");
			Assert.assertTrue(element.isDisplayed(), "Element " + element.getText() + " is displayed");
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException - Element is not displayed");
		}
	}

	public static void verifyElementTextIsAsExpected(WebElement element, String expected) {
		try {
			Assert.assertEquals(StringBlocks.getWebElementText(element), expected);
		} catch (Exception e) {
			System.out.println("Unable to compare actual string to expected string. " + e);
		}
	}
}
