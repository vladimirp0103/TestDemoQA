package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeElements {
	
	WebDriver driver;
	
	public void LoginBtnElement(WebDriver driver) {
		this.driver=driver;
	}

	By LoginBtn = By.id("login");

}
