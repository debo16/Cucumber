package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Definition {
		public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver;
		@Given("open browser & navigate to login page")
		public void open_browser_navigate_to_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get(url);
		}

		@When("Enter username {string}")
		public void enter_username(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(4000);
		    driver.findElement(By.name("username")).sendKeys(string);
		}

		@When("Enter password {string}")
		public void enter_password(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(8000);
			driver.findElement(By.name("password")).sendKeys(string);
		}

		@And("Click on login")
		public void click_on_login() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(8000);
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		}

		@Then("we should redirect in homepage of ornageHRM")
		public void we_should_redirect_in_homepage_of_ornage_hrm() {
			driver.getTitle();
		    driver.close();
		}

		
	}

