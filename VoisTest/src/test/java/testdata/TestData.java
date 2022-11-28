package testdata;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	
	XSSFWorkbook workbok;
	XSSFSheet sheet;
	
	public TestData(String excelpath, String sheetname) {
		try {
		 workbok = new XSSFWorkbook(excelpath);
	     sheet =  workbok.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}public TestData() {
		// TODO Auto-generated constructor stub
	}
	
	//Getting the test data for the Registeration step
	public String getGender() {
         return  sheet.getRow(1).getCell(0).getStringCellValue();	
	}
	public String getfirstname() {
        return  sheet.getRow(1).getCell(1).getStringCellValue();	
	}
	public String getlastname() {
        return  sheet.getRow(1).getCell(2).getStringCellValue();	
	}
	public int getbirthday() {
		int bday =0 ;
        return  bday = (int) sheet.getRow(1).getCell(3).getNumericCellValue();	
	}
	public int getbirmonth() {
		int bmonth =0 ;
        return  bmonth = (int) sheet.getRow(1).getCell(4).getNumericCellValue();
	}
	public int getbirthyear() {
		int byear =0 ;
        return  byear = (int) sheet.getRow(1).getCell(5).getNumericCellValue();
	}
	public String getemail() {
        return  sheet.getRow(1).getCell(6).getStringCellValue();	
	}
	public String getcompanyname() {
        return  sheet.getRow(1).getCell(7).getStringCellValue();
	}
	public String getpassword() {
        return  sheet.getRow(1).getCell(8).getStringCellValue();	
	}
	public String getconfirmpassword() {
        return  sheet.getRow(1).getCell(9).getStringCellValue();	
	}
	
	// Getting the test Data for the searching for products step
	
	public String getproductname() {
        return  sheet.getRow(1).getCell(0).getStringCellValue();	
	}
	
	//Getting the test data for the billing Address
	
	public int getcountry() {
		int countrycode =0 ;
        return  countrycode = (int) sheet.getRow(1).getCell(0).getNumericCellValue();	
	}
	public String getcity() {
        return  sheet.getRow(1).getCell(1).getStringCellValue();	
	}
	public String getaddress1() {
        return  sheet.getRow(1).getCell(2).getStringCellValue();
	}
	public int getzipcode() {
		int zipcod =0 ;
        return  zipcod = (int) sheet.getRow(1).getCell(3).getNumericCellValue();
	}
	public int getphonnumber() {
		int phone =0 ;
        return  phone = (int) sheet.getRow(1).getCell(4).getNumericCellValue();	
	}
	public String getshipmentmethod() {
        return  sheet.getRow(1).getCell(5).getStringCellValue();	
	}
	
	

}
