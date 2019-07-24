package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesdemo {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  d.manage().window().maximize();
	  d.switchTo().frame(d.findElement(By.name("iframeResult")));
	  d.findElement(By.xpath("//button[text()='Try it']")).click();
	  String s=d.switchTo().alert().getText();
	  System.out.println(s);
	  d.switchTo().alert().accept();
	  d.switchTo().defaultContent();
	  String t=d.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText();
	  System.out.println(t);
	  d.close();

	  
  }
}
