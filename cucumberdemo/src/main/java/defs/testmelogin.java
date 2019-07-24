package defs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmelogin {
	WebDriver d;

	@Given("I am launching the test me apllication in chrome")
	public void i_am_launching_the_test_me_apllication_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		  d = new ChromeDriver();
		  d.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@Given("I click on SignIn link")
	public void i_click_on_SignIn_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  WebElement x=d.findElement(By.xpath("//a[@href='login.htm']"));
			x.click();
		
		
	}

	@When("I provide {string}")
	public void i_provide(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		d.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
		
		
	}

	@When("I provide password {string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@Then("I click on login and verify the login status")
	public void i_click_on_login_and_verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		d.findElement(By.xpath("//input[@name='Login']")).click();
		d.close();
	}
}
