package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex1testclass02 {
	 @Test
	  public void tmethod3() {
		  System.out.println("method 3");
	  }
	 @Test
	  public void tmethod4() {
		  System.out.println("method 4");
	  }
	 @BeforeMethod
	 public void before2() {
		 System.out.println("before in class 2");
	 }
	 @AfterClass
	 public void after2() {
		 System.out.println("after class 2");
	 }
}
