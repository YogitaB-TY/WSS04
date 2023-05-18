package learningTestNg;

import org.testng.annotations.Test;

public class Learning_DependencyMethods {
	
	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {
		System.out.println("Login test case code");
	}
	
	@Test( )
	public void registerTest() {
		System.out.println("Register Test case code");
		//int i=1/0;
	}
	
	@Test()
	public void cartTest() {
		System.out.println("cart test case code");
	}
	
	@Test()
	public void wishlistTest() {
		System.out.println("Wishlist test case code");
	}
	
	@Test()
	public void endToEndTC() {
		System.out.println("End To end flow test case");
		//int i=1/0;
	}

}
