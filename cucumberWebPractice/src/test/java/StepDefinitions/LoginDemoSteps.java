package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

//	WebDriver driver;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_username_and_password(String username, String password) {
//
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//
//	@Then("user should see {string}")
//	public void user_is_navigated_to_homepage(String status) {
//
//		if (driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed()) {
//			System.out.println("User is on homepage: " + status);
//		} else {
//			System.out.println("Login Failed:" + status);
//		}
//
//		driver.quit();
//	}
}
