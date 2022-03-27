package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.PropertiesFile;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
private DashboardPage dashboardPage;
protected HomePage homePage;
protected LoginPage loginPage;

@BeforeMethod(alwaysRun = true)
public void setUp() {
	dashboardPage = new DashboardPage(driver);
	homePage = new HomePage(driver);
	loginPage = new LoginPage(driver);
}

private static String USER = PropertiesFile.getUsername();
private static String PASS = PropertiesFile.getPassword();

@AfterMethod(alwaysRun = true)
public void tearDown() {
	
}

@Test(description = "Verify that user can login and then logout")

public void verifyThatUserCanLoginAndThenLogout() throws InterruptedException {
	homePage.clickLogin();
	Thread.sleep(1000);
	loginPage.enterUsername(USER);
	loginPage.enterPassword(PASS);
	loginPage.clickLogin();
	Thread.sleep(1000);
	DashboardPage.getHeading();
	System.out.println("The page heading is Book Store " +DashboardPage.getHeading());
	Thread.sleep(1000);
	dashboardPage.clickLogout();
}
}