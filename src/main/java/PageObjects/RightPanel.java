package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Blocks.NumberBlocks;
import Blocks.StringBlocks;
import Blocks.VerificationsBlocks;
import Extensions.UIActions;
import Utils.Base;

public class RightPanel extends Base {

	protected static     String generatedUserName;
	protected static     String generatedPassword;
	private static final String registrationSuccessMessageText = "Your account was created successfully. You are now logged in.";

	@FindBy(how = How.ID, using = "loginPanel")
	public WebElement loginPanel;

	@FindBy(how = How.ID, using = "customer.firstName")
	public WebElement firstName;

	@FindBy(how = How.ID, using = "customer.lastName")
	public WebElement lastName;

	@FindBy(how = How.ID, using = "customer.address.street")
	public WebElement address;

	@FindBy(how = How.ID, using = "customer.address.city")
	public WebElement city;

	@FindBy(how = How.ID, using = "customer.address.state")
	public WebElement state;

	@FindBy(how = How.ID, using = "customer.address.zipCode")
	public WebElement zipCode;

	@FindBy(how = How.ID, using = "customer.ssn")
	public WebElement ssn;

	@FindBy(how = How.ID, using = "customer.username")
	public WebElement userName;

	@FindBy(how = How.ID, using = "customer.password")
	public WebElement password;

	@FindBy(how = How.ID, using = "repeatedPassword")
	public WebElement repeatedPassword;

	@FindBy(how = How.XPATH, using = "//input[@value='Register']")
	public WebElement registerButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
	public WebElement registerButtonLeftPanel;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your account was created successfully. You are now logged in.')]")
	public WebElement registrationSuccessMessage;

	@FindBy(how = How.ID, using = "accountTable")
	public WebElement accountTable;


	public void register() {
		clickRegisterLeftPanel();
		enterFirstName(firstName);
		enterLastName(lastName);
		enterAddress(address);
		enterCity(city);
		enterState(state);
		enterZipCode(zipCode);
		enterSSN(ssn);
		enterUserName(userName);
		enterPassword(password);
		confirmPassword(repeatedPassword);
		submitRegistrationForm(registerButton);
	}

	public static void enterFirstName(WebElement firstName) {
		UIActions.click(firstName);
		UIActions.clearField(firstName);
		UIActions.enterText(firstName, StringBlocks.generateRandomFirstName());
	}

	public static void enterLastName(WebElement lastName) {
		UIActions.click(lastName);
		UIActions.clearField(lastName);
		UIActions.enterText(lastName, StringBlocks.generateRandomLastName());
	}

	public static void enterAddress(WebElement address) {
		UIActions.click(address);
		UIActions.clearField(address);
		UIActions.enterText(address, StringBlocks.generateRandomAddress());
	}

	public static void enterCity(WebElement city) {
		UIActions.click(city);
		UIActions.clearField(city);
		UIActions.enterText(city, StringBlocks.generateRandomCity());
	}

	public static void enterState(WebElement state) {
		UIActions.click(state);
		UIActions.clearField(state);
		UIActions.enterText(state, StringBlocks.generateRandomState());
	}

	public static void enterZipCode(WebElement zipCode) {
		UIActions.click(zipCode);
		UIActions.clearField(zipCode);
		UIActions.enterText(zipCode, String.valueOf(NumberBlocks.generateRandomZipCode()));
	}

	public static void enterSSN(WebElement ssn) {
		UIActions.click(ssn);
		UIActions.clearField(ssn);
		UIActions.enterText(ssn, String.valueOf(NumberBlocks.generateRandomSSN()));
	}

	public static void enterUserName(WebElement userName) {
		generatedUserName = StringBlocks.generateRandomUsername();
		UIActions.click(userName);
		UIActions.clearField(userName);
		UIActions.enterText(userName, generatedUserName);
	}

	public static void enterPassword(WebElement password) {
		generatedPassword = StringBlocks.generateRandomPassword();
		UIActions.click(password);
		UIActions.clearField(password);
		UIActions.enterText(password, generatedPassword);
	}

	public static void confirmPassword(WebElement repeatedPassword) {
		UIActions.click(repeatedPassword);
		UIActions.clearField(repeatedPassword);
		UIActions.enterText(repeatedPassword, generatedPassword);
	}

	public static void submitRegistrationForm(WebElement registerButton) {
		UIActions.click(registerButton);
	}

	public void clickRegisterLeftPanel() {
		UIActions.click(registerButtonLeftPanel);
	}

	public void verifyRegistrationSuccessMessageIsVisible() {
		VerificationsBlocks.verifyElementIsDisplayed(registrationSuccessMessage);
	}

	public void verifyLoginPanelIsDisplayed() {
		VerificationsBlocks.verifyElementIsDisplayed(loginPanel);
	}

	public void verifyRegistrationSuccessMessageIsAsExpected() {
		VerificationsBlocks.verifyElementTextIsAsExpected(registrationSuccessMessage, registrationSuccessMessageText);
	}


}
