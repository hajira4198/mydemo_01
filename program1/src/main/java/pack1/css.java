package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://10.232.237.143:443/TestMeApp/login.htm");
		d.findElement(By.cssSelector("input#userName")).sendKeys("asdfgh");
		d.findElement(By.cssSelector("input#password")).sendKeys("asdfgh");
		d.findElement(By.cssSelector("input[name='Login']")).click();
		
	}

}
