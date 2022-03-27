package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.PropertiesFile;
import elements.HomeElements;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;

public class BaseTest {

	public static WebDriver driver;
	protected BasePage basePage;
	protected LoginPage loginPage;
	protected HomeElements homeElements;
	protected DashboardPage dashboardPage;
	
	private static final String APP_URL = PropertiesFile.getAppUrl();
	
	@BeforeMethod
	public void launchApplication() {
		setBrowserProperty();
		
		basePage = new BasePage();
		loginPage = new LoginPage(driver);
		homeElements = new HomeElements();
		dashboardPage = new DashboardPage(driver);
		
		basePage.setWebDriver(driver);
		driver.manage().window().maximize();
		goToLoginPage();
		

		
	}

	private void goToLoginPage() {
		driver.get(APP_URL + "/login");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}
	
	public WebDriver getDriver() {
		return BaseTest.driver;
		
	}
	
	private void setBrowserProperty() {
		if(PropertiesFile.getBrowser().equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome driver win 32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
