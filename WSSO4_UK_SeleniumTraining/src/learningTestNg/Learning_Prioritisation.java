package learningTestNg;

import org.testng.annotations.Test;

public class Learning_Prioritisation {

	//Register --> Login --> wishlist --> Cart -->EndToEnd
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println("Login test case code");
	}
	
	@Test(priority = 1 )
	public void registerTest() {
		System.out.println("Register Test case code");
	}
	
	@Test(priority = 4)
	public void cartTest() {
		System.out.println("cart test case code");
	}
	
	@Test(priority = 3)
	public void wishlistTest() {
		System.out.println("Wishlist test case code");
	}
	
	@Test(priority = 5 )
	public void endToEndTC() {
		System.out.println("End To end flow test case");
		//int i=1/0;
	}

}

