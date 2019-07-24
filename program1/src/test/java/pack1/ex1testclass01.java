package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex1testclass01 {
  @Test(priority=2)
  public void tmethod1() {
	  System.out.println("method 1");
  }
  @Test(priority=1)
  public void tmethod2() {
	  System.out.println("method 2");
  }
  @Test(priority=3)
  public void tmethod5() {
	  System.out.println("method 5");
  }
  @BeforeMethod
	 public void before1() {
		 System.out.println("before in class 1");
	 }
  @AfterClass
	 public void after1() {
		 System.out.println("after class 1");
	 }
}
