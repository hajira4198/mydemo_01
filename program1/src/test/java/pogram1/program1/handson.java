package pogram1.program1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class handson {
	WebDriver d;
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println("login");
	  	d.findElement(By.xpath("//input[@name='userName']")).sendKeys(n);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(s);
		d.findElement(By.xpath("//input[@name='Login']")).click();
		String t="Home";
		String a=d.getTitle();
		if(a.equals(t)) {
			System.out.println("Login Successfull "+n);
		}
		else
			System.out.println("Invalid login");
	
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "asdfgh", "asdfgh" },
      new Object[] { "qwerty", "qwerty" },
      new Object[] { "zxcvbn", "zxcvbn" },
      new Object[] { "ram123", "ram123" },
    };
  }
  @BeforeClass
  public void launch() {
	  System.out.println("launching of the test");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://10.232.237.143:443/TestMeApp");
		
  }
  @AfterMethod
  public void logout(){
		d.findElement(By.xpath("//a[@href='logout.htm']")).click();
		
  }
  @BeforeMethod
  public void login() throws InterruptedException{
	  Thread.sleep(5000);
	  WebElement x=d.findElement(By.xpath("//a[@href='login.htm']"));
		x.click();
		
  }
  
  
}
