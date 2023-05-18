package learningTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Learning_readExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		testData("Login");
	}
	
	public static String[][] testData(String sheetName) throws EncryptedDocumentException, IOException {
		
		File file=new File("./TestData/Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);
		
		int row_size=sheet.getPhysicalNumberOfRows();
		int col_size=sheet.getRow(0).getPhysicalNumberOfCells();
		
		//create 2d array of one row less
		String[][] data=new String[row_size-1][col_size];
		
		//iterate until row_size-1
		for(int i=0;i<row_size-1;i++) {
			for(int j=0;j<col_size;j++) {
				//getRow() start from i+1
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
		
		/*
		 * for(int i=0;i<row_size-1;i++) { for (int j = 0; j < col_size; j++) {
		 * System.out.println(data[i][j]); } }
		 */
		
		
	}
	
	public static void singleRead() throws EncryptedDocumentException, IOException {
		//1st Step - Create file instance and provide excel file path
		File file=new File("./TestData/Data.xlsx");
				
		//2nd Step - Create instance for File InputStream and pass file ref_var to its constructor
		FileInputStream fis= new FileInputStream(file);
				
		//3rd Step - Create ref_variable of type WorkBook
		Workbook workbook = WorkbookFactory.create(fis);
				
		//4th Step - using workbook ref_variable fetch the sheet using sheet name
		Sheet sheet= workbook.getSheet("Sheet1");
				
	   System.out.println(sheet.getRow(1).getCell(2));
				
	}

}
