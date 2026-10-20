package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	private By txt_username = By.xpath("//input[@name='username']");
	private By txt_password = By.xpath("//input[@name='password']");
	private By btn_submit = By.xpath("//button[@type='submit']");
	private By txt_dashboard = By.xpath("//h6[text()='Dashboard']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void usernameField(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void passwordField(String password) {
		driver.findElement(txt_password).sendKeys(password);;
	}

	public void loginbtn() {
		driver.findElement(btn_submit).click();
	}

	public void dashboardtxt(String status) {
		if (driver.findElement(txt_dashboard).isDisplayed()) {
			System.out.println("User is on homepage: " + status);
		} else {
			System.out.println("Login Failed:" + status);
		}
	}
}
