package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static String url = "https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	@Given("open browser and navigate to log in page")
	public void open_browser_and_navigate_to_log_in_page() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(3000);
	}
	@When("enter username {string}")
	public void enter_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys(string);
	}
	@And("enter password {string}")
	public void enter_password(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(string);
	}
	@And("hit on submit")
	public void hit_on_submit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("Shoud see the login page and title as Welcome: Mercury Tours")
	public void shoud_see_the_login_page_and_title_as_welcome_mercury_tours() throws InterruptedException {
		Thread.sleep(3000);
	   driver.close();
	}
}
