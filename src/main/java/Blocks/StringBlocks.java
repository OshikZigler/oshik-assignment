package Blocks;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

import Utils.CommonOps;

public class StringBlocks extends CommonOps {

	private static String generateRandomString(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}

	public static String generateRandomFirstName() {
		return generateRandomString(10);
	}

	public static String generateRandomLastName() {
		return generateRandomString(10);
	}

	public static String generateRandomAddress() {
		return generateRandomString(10);
	}

	public static String generateRandomCity() {
		return generateRandomString(10);
	}

	public static String generateRandomState() {
		return generateRandomString(10);
	}

	public static String generateRandomUsername() {
		return generateRandomString(10);
	}

	public static String generateRandomPassword() {
		return generateRandomString(10);
	}

	public static String getWebElementText(WebElement element) {
		String webElementText = element.getText();
		return webElementText;
	}
}
