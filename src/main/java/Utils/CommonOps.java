package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonOps extends Base{

	private static final String URL = "https://parabank.parasoft.com";

	@BeforeClass
	public void startSession() {
		initBrowser();
		PageManager.initPages();
	}

	@AfterClass
	public void endSession() {
		driver.quit();
	}


	//initializing ChromeDriver
	public static WebDriver initChromeDriver() {
		WebDriverManager.chromedriver()
		                .setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	//initializing Browser
	public static void initBrowser() {
		driver = initChromeDriver();
		driver.manage()
		      .window()
		      .maximize();
		driver.get(URL);

		//implicitly wait
		driver.manage()
		      .timeouts()
		      .implicitlyWait(Long.parseLong("3"), TimeUnit.SECONDS);
		//explicitly wait
		explicitWait = new WebDriverWait(driver, Long.parseLong("3"));


	}
}
