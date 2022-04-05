package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String localpath;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public ExcelUtils(String excelpath,String sheetname) 
	{
		try {
			File file=new File(excelpath);
			FileInputStream fis=new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheetname);
			
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		getrowcount();
//		getcelldata(1,0);
		getcolumncount();

	}

	public static int getrowcount() 
	{
		int rowcount =0;
		try
		{
		 rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("The total number of rows in sheet are:" + rowcount);
		
    }
		catch (Exception exp) {
			exp.printStackTrace();
		}
		return rowcount;
	}
	
	public static int getcolumncount() 
	{
		int columncount =0;
		try
		{
			columncount  = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("The total number of columns in sheet are:" + columncount);
		
    }
		catch (Exception exp) {
			exp.printStackTrace();
		}
		return columncount;
	}

	public static String getcelldata(int rownum,int cellnum) {
		String celldata=null;
		try
		{
		localpath = System.getProperty("user.dir");
		File file=new File(localpath+"/src/test/resources/Excel/ExcelOperation1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("LoginData");
		 celldata = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		catch (Exception exp) {
			exp.printStackTrace();
		}
		return celldata;
	}
        
}
