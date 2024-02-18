package Extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.CommonOps;

public class UIActions extends CommonOps {

	static Actions actions = new Actions(driver);

	public static void click(WebElement element) {
		explicitWait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void clearField(WebElement element) {
		explicitWait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
	}

	public static void enterText(WebElement element, String value) {
		explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void enterNumber(WebElement element, Integer value) {
		explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value.toString());
	}

	public static void hoverToElement(WebElement element) {
		explicitWait.until(ExpectedConditions.visibilityOf(element));
		actions.moveToElement(element);
	}
}
