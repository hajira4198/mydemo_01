package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest1 {
  @Test(dataProvider = "credentials")
  public void registration(String n, String s) {
	  System.out.println("code for registration");
	  System.out.println("Username is : "+n);
	  System.out.println("Password is : "+s);
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "haj", "demo" },
      new Object[] { "xyz", "xyz" },
      new Object[] { "abc", "abc" },
      new Object[] { "xz", "xz" },
    };
  }
  @Test
  public void login() {
	  
  }
}
