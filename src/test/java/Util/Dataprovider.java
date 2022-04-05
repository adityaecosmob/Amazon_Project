package Util;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
	
	@DataProvider (name="phonename")
	public String[]phonedata()
	{
		return new String[]
		 {
				"iphone 13"
		};
		
	};
	

}
