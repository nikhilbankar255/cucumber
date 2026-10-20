package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

	protected WebDriver driver;

	public LoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement txt_username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_submit;

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement text_dashboard;

	public void usernameField(String username) {
		txt_username.sendKeys(username);
	}

	public void passwordField(String password) {
		txt_password.sendKeys(password);
	}

	public void submitbtn() {
		btn_submit.click();
	}

	public void textDashboard(String status) {
		if (text_dashboard.isDisplayed()) {
			System.out.println("User is on homepage: " + status);
		} else {
			System.out.println("Login Failed:" + status);
		}
	}
}
