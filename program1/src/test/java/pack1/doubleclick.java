package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleclick {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("http://www.newtours.demoaut.com/");
	  d.manage().window().maximize();
	  WebElement e1=d.findElement(By.xpath("//b[text()='sign-in here']"));
	  Actions a=new Actions(d);
	  a.doubleClick(e1).build().perform();
	  d.close();
  }
}
