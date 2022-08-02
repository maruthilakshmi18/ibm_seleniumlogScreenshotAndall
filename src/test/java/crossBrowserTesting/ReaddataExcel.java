package crossBrowserTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataExcel {

	public static void main(String[] args) throws Exception {	

		FileInputStream fis=new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\com.org.ibm.chrome\\data\\Readdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");

	        int rowCount = sheet.getLastRowNum(); // return rows count details
	        int columnsCount = sheet.getRow(0).getLastCellNum(); // return cloumns count details

	        System.out.println("Rows count: " + rowCount);
	        System.out.println("Columns Count: " + columnsCount);

	        for (int i = 1; i <= rowCount; i++) {

	            XSSFRow currentRow = sheet.getRow(i);

	            String firstName = currentRow.getCell(0).toString();
	            String lastName = currentRow.getCell(1).toString();
	            String email = currentRow.getCell(2).toString();
	            String phone = currentRow.getCell(3).toString();
	            String address = currentRow.getCell(4).toString();

	            
	            System.out.println("FirstName and Address: " + firstName + " : " + address);
	            System.out.println("--------------------");
	            
	            
	        }

	    }
	}

