package Util;

import org.testng.annotations.DataProvider;

public class Exceldataprovider {

	String localpath = System.getProperty("user.dir");
	String path = localpath + "/src/test/resources/Excel/ExcelOperation1.xlsx";

	@DataProvider(name = "LoginCredentials")
	public Object[][] getdata() {
		Object data[][] = Logindata(path, "LoginData");
		return data;
	}

	public static Object[][] Logindata(String excelpath, String sheetname) {
		ExcelUtils excel = new ExcelUtils(excelpath, sheetname);
		int rowcount = excel.getrowcount();
		int columncount = excel.getcolumncount();

		Object data[][] = new Object[rowcount - 1][columncount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				String celldata = excel.getcelldata(i, j);
				System.out.print(celldata + " | ");
				data[i - 1][j] = celldata;
			}
			System.out.println();
		}
		return data;
	}

}
