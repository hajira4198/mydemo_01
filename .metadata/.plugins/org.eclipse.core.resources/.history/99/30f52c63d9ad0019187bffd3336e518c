package stepDef22july;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefStep {
	
	WebDriver driver;
	
	@Given("customer opened the application")
	public void customer_opened_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		System.out.println("customer opened the application");
	}

	@When("customer provides the registration details")
	public void customer_provides_the_registration_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("registration details");
		driver.findElement(By .linkText("REGISTER")).click();
		//id , name ,class name, css, xpath,linktext,tagname
		driver.findElement(By .name("country")).sendKeys("TOGO");
		driver.findElement(By .name("email")).sendKeys("john");
		driver.findElement(By .name("password")).sendKeys("HP");
		driver.findElement(By .name("confirmPassword")).sendKeys("HP");
		driver.findElement(By .name("register")).click();
	}
	
	
	@Given("open the browser")
	public void open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Browser opened");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}


	@Then("customer registration is successful")
	public void customer_registration_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("registration successful");
		
		String str=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	    if(str.equals("Note: Your user name is john.")) {
	    	System.out.println("success");
	    }
	    else {
	    	System.out.println("failure");
	    }
	}

	@When("customer provides  the credentials as {string} and {string}")
	public void customer_provides_the_credentials_as_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("user"+string+"password"+string2);
	}

	@Then("login is successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("login is successful");
	}
}
