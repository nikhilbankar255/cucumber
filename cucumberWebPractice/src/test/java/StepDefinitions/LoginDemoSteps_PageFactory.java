package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPagePF;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_PageFactory {

	public WebDriver driver;
	LoginPagePF page;
	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		page=new LoginPagePF(driver);
		page.usernameField(username);
		page.passwordField(password);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		page.submitbtn();
	}

	@Then("user should see {string}")
	public void user_is_navigated_to_homepage(String status) {

		page.textDashboard(status);

		driver.quit();
	}
}
