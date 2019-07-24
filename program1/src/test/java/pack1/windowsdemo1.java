package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowsdemo1 {
	WebDriver d;
	
	
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.get("https://retail.onlinesbi.com/retail/login.htm");
	  String win_name=d.getWindowHandle();
	  System.out.println(win_name);
	  d.manage().window().maximize();
	  d.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	  Thread.sleep(5000);
	  Set<String> t_windows=d.getWindowHandles();
	  int cnt_window=t_windows.size();
	  System.out.println(cnt_window);
	  for (String s : t_windows) {
		  d.switchTo().window(s);
		  System.out.println(d.getWindowHandle());
		  
	  }
	  d.findElement(By.linkText("Apply Now")).click();
	  
	  
  }
}
