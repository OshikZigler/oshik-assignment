package Tests;

import org.testng.annotations.Test;

import Utils.CommonOps;

public class sampleTests extends CommonOps {


	@Test(description = "Perform successful registration")
	public void Test_01_verifyRegistrationIsSuccessful() {
		rightPanel.register();
		rightPanel.verifyRegistrationSuccessMessageIsVisible();
		rightPanel.verifyRegistrationSuccessMessageIsAsExpected();
	}

	@Test(description = "perform successful logout")
	public void Test_02_verifyLogOutIsSuccessful() {
		leftPanel.performLogout();
		rightPanel.verifyLoginPanelIsDisplayed();
	}

	@Test(description = "perform successful login")
	public void Test_03_verifyLogInIsSuccessful() {
		leftPanel.performLogin();
		leftPanel.verifyWelcomeMessageIsDisplayed();
		leftPanel.verifyAccountTableIsDisplayed();
	}


}
