package pack1;

import org.testng.annotations.Test;

public class demo2 {
	
  @Test(priority=1)
  public void testGoogle() {
	  System.out.println("test google");
  }
  @Test(priority=2)
  public void testTwitter() {
	  System.out.println("test twitter");
  }
  @Test(priority=3,enabled=false)
  public void testFacebook() {
	  System.out.println("Test facebook");
  }
}
