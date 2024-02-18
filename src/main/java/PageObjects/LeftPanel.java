package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Blocks.VerificationsBlocks;
import Extensions.UIActions;
import Utils.Base;

public class LeftPanel extends Base {

	RightPanel rightPanelInstance = new RightPanel();

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
	public WebElement registerButtonLeftPanel;

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Welcome')]")
	public WebElement welcomeMessage;

	@FindBy(how = How.CSS, using = "input[name='username']")
	public WebElement userNameElement;

	@FindBy(how = How.CSS, using = "input[name='password']")
	public WebElement passwordElement;

	@FindBy(how = How.CSS, using = "input[type='submit']")
	public WebElement loginButtonElement;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Log Out')]")
	public WebElement logOutButton;


	public void performLogin() {
		enterUserName(leftPanel.userNameElement, rightPanelInstance.generatedUserName);
		enterPassword(leftPanel.passwordElement, rightPanelInstance.generatedPassword);
		clickLogin(leftPanel.loginButtonElement);
	}

	public void performLogout() {
		clickLogOut(leftPanel.logOutButton);
	}

	public static void enterUserName(WebElement userNameElement, String userNameText) {
		UIActions.click(userNameElement);
		UIActions.clearField(userNameElement);
		UIActions.enterText(userNameElement, userNameText);
	}

	public static void enterPassword(WebElement passwordElement, String passwordText) {
		UIActions.click(passwordElement);
		UIActions.clearField(passwordElement);
		UIActions.enterText(passwordElement, passwordText);
	}

	public static void clickLogin(WebElement loginButtonElement) {
		UIActions.click(loginButtonElement);
	}

	public static void clickLogOut(WebElement logoutButton) {
		UIActions.click(logoutButton);
	}

	public static void verifyWelcomeMessageIsDisplayed() {
		VerificationsBlocks.verifyElementIsDisplayed(leftPanel.welcomeMessage);
	}

	public static void verifyAccountTableIsDisplayed() {
		VerificationsBlocks.verifyElementIsDisplayed(rightPanel.accountTable);
	}


}
