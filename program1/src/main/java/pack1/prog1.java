package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		//Thread.sleep(1000);
		WebElement x=driver.findElement(By.xpath("//a[@href='login.htm']"));
	//	x.click();
		//String a=driver.getTitle();
		//String t=driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).getText();
		//String b="Login";
		//if(a.equals(b)) {
		//	System.out.println("equal");
		//}
		//else
			//System.out.println("fail");
		
		List<WebElement> t=driver.findElements(By.tagName("a"));
		int c=t.size();
		System.out.println(c);
		
		for(int i=0;i<c;i++)
		{
			String l=t.get(i).getText();
			System.out.println(l);
		}
			
	}

}
