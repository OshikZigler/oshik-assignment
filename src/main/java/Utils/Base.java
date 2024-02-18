package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LeftPanel;
import PageObjects.RightPanel;

public class Base {

	//initializing drivers
	public static WebDriver     driver;
	public static WebDriverWait explicitWait;

	//defining page objects
	public static RightPanel rightPanel;
	public static LeftPanel  leftPanel;
}
