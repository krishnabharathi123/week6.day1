package StepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static ChromeDriver driver;

	@Given("Open the browser and launch the {string}")
	public void openBrowse(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	/*
	 * @And("Enter valid {string} {string}") public void userName(String name,
	 * String value) { driver.findElement(By.id(name)).sendKeys(value); }
	 */

	@When("Click on the submit button")
	public void submit() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("{string} page should be displayed")
	public void pageDisplayed(String val) {
		System.out.println(val + " is displayed");

	}

	@When("Click on the {string} link")
	public void clickLink(String linkVal) {
		driver.findElement(By.linkText(linkVal)).click();
	}

	@Given("Enter the {string} {string}")
	public void enterValues(String name1, String value1) {
		driver.findElement(By.id(name1)).sendKeys(value1);
	}

	@When("Click on submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("New Lead should be created")
	public void createdLead() {
		System.out.println("New lead is created");

	}
}
