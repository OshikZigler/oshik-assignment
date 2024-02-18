package Utils;

import org.openqa.selenium.support.PageFactory;

import PageObjects.LeftPanel;
import PageObjects.RightPanel;

public class PageManager extends Base {

	public static void initPages() {

		//Initiating page objects
		rightPanel = PageFactory.initElements(driver, RightPanel.class);
		leftPanel = PageFactory.initElements(driver, LeftPanel.class);
	}
}
