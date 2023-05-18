package learningTestNg;

import org.testng.annotations.Test;

public class Learning_GroupExecution {
	
	@Test(groups = "Functional")
	public void loginTest() {
		System.out.println("Login test case code");
	}
	
	@Test(groups = "Integration", enabled = false)
	public void registerTest() {
		System.out.println("Register Test case code");
	}
	
	@Test(groups = "Integration" )
	public void cartTest() {
		System.out.println("cart test case code");
	}
	
	@Test(groups = "Integration" , dependsOnGroups = "System")
	public void wishlistTest() {
		System.out.println("Wishlist test case code");
	}
	
	@Test(groups = "System")
	public void endToEndTC() {
		System.out.println("End To end flow test case");
		//int i=1/0;
	}

}
