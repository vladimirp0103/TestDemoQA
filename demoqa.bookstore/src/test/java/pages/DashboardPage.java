package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{
	

	
	//Constructor that will be automatically called as soon as the object of the class is created
	public DashboardPage(WebDriver driver) {

	}

	//Locators for the page title and the logout button
	static By heading = By.xpath("//div[@class=\"main-header\"]");
	By logoutBtn = By.id("submit");
	
	//Method to capture the page heading
	public static String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
		
	}
	
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}