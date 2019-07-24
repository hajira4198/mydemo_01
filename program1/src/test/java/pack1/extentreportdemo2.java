package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class extentreportdemo2 {
	WebDriver d;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
  @Test
  public void f() {
	  test=extent.createTest("tc_01","title validation");
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("http://10.232.237.143:443/TestMeApp");
	  d.manage().window().maximize();
	  d.findElement(By.xpath("//a[@href='login.htm']")).click();
	  d.findElement(By.xpath("//input[@name='userName']")).sendKeys("asdfgh");
	  d.findElement(By.xpath("//input[@name='password']")).sendKeys("asdfgh");
	  d.findElement(By.xpath("//input[@name='Login']")).click();
	  
	  String atitle="Home1";
	  String etitle=d.getTitle();
	  Assert.assertEquals(atitle, etitle);
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
		  TakesScreenshot snapshot=(TakesScreenshot)d;
		  File src=snapshot.getScreenshotAs(OutputType.FILE);
		  String Path=System.getProperty("user.dir")+"/test-output/screens/"+result.getName()+".png";
		  FileUtils.copyFile(src,new File(Path));
		  test.addScreenCaptureFromPath(Path,result.getName());
		  test.fail(result.getThrowable());  
		  
	  }
	  else if(result.getStatus()==ITestResult.SUCCESS) {
		  test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"PASSED", ExtentColor.GREEN));	  
	  	}
	  else {
		  test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"SKIPPED", ExtentColor.ORANGE));
		  test.skip(result.getThrowable());
	  }
  }
  
  @Parameters({"OS","browser"})
  @BeforeTest
  public void startReport(String OS,String browser) {
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/testReport.html");
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  extent.setSystemInfo("OS",OS);
	  extent.setSystemInfo("Browser",browser);
//	  htmlReporter.config().setChartVisibilityOnOpen(true);
	  htmlReporter.config().setDocumentTitle("Extent Report Demo");
	  htmlReporter.config().setReportName("Test Report");
//	  htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	  htmlReporter.config().setTheme(Theme.STANDARD);
	  htmlReporter.config().setTimeStampFormat("EEEE,MMMM dd, yyyy, hh:mm a '('zzz')'");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
  }

}

