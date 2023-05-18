package learningTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	@Test(dataProvider = "Register")
	public void RegisterTestData(String Gender, String FirstName, String LAstName, String Email, String Password) {
		
		System.out.println(FirstName);
		System.out.println(LAstName);
		System.out.println(Email);
		System.out.println(Password);
		
	}
	
	@Test
	@DataProvider(name = "Register")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		
		return Learning_readExcel.testData("Sheet1");
	
		
		/*
		 * String[][] data=new String[2][2]; data[0][0]="yogbelavanaki@gmail.com";
		 * data[0][1]="Password@123"; data[1][0]="deepveer@gmail.com";
		 * data[1][1]="Password@123"; return data;
		 */
	}



}
