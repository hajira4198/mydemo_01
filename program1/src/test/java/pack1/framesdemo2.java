package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framesdemo2 {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://www.tsrtconline.in/oprs-web/");
	  d.manage().window().maximize();
	  d.findElement(By.xpath("//input[@id='searchBtn']")).click();
	  String s=d.switchTo().alert().getText();
	  System.out.println(s);
	  d.switchTo().alert().accept();
	  d.switchTo().defaultContent();
	  d.close();
  }
}