package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

	public WebDriver driver;

	@Before
	public void browserSetup()
	{
		System.out.println("I am inside Before hooks.....");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://google.com");
	}

	@BeforeStep
	public static void beforeStep()
	{
		System.out.println("I am inside before Steps.......");
	}

	@AfterStep
	public static void afterStep()
	{
		System.out.println("I am inside After Steps.......");
	}
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is naviagted to the homepage")
	public void user_is_naviagted_to_the_homepage() {
	}

	@After
	public void tearDown()
	{
		System.out.println("I am inside After hooks.....");

		if(driver!=null)
		{
			driver.quit();
		}
	}
}

