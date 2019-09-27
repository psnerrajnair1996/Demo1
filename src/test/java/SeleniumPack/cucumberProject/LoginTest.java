package SeleniumPack.cucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import SeleniumPack.cucumberProject.Pages;
import SeleniumPack.cucumberProject.UtilityClass;
public class LoginTest 
{
	WebDriver driver;
	@Given("^user is in the Login Page$")
	public void user_is_on_the_home_page() throws Throwable {
		driver = UtilityClass.startBrowser("firefox", "http://newtours.demoaut.com/");
	}

	@When("^user enters valid credentials and performs Login$")
	public void user_enter_the_valid_credentials() throws Throwable 
	{
		Pages page= new Pages(driver);
		page.do_login("tutorial", "tutorial");
	}

	@Then("^user must be navigated to the Home Page$")
	public void user_must_in_home_page_and_display_success_message() throws Throwable 
	{
		WebDriverWait wait= new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Logged in Successfully !!");
		driver.close();
	}
}