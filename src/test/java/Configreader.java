import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

public final class Configreader {
	
	Properties pro;
	
	public Configreader()
	{
	try
	{
	File src=new File("/home/aditya/eclipse-workspace/Amazon_Project/src/test/resources/Configuration/config.properties");
	FileInputStream fis=new FileInputStream(src);
	 pro=new Properties();
	pro.load(fis);
	
	}
	catch(Exception e)
	{
		System.out.println("Exception is =="+e.getMessage());
	}
	}
	
	public String getChromepath()
	{
		String path= pro.getProperty("Chromedriver");
		return path;
	}
	
	public String getURL()
	{
		String URLpath= pro.getProperty("URL");
		return URLpath;
	}
   
	public String getgmailuser1()
    {
    	String gmailuser1=pro.getProperty("gmailuser1");
    	return gmailuser1;
    }
	
	public String getgmailuser2()
    {
    	String gmailuser2=pro.getProperty("gmailuser2");
    	return gmailuser2;
    }
	public String getgmailuser3()
    {
    	String gmailuser1=pro.getProperty("gmailuser3");
    	return gmailuser1;
    }
	public String getgmailuser4()
    {
    	String gmailuser1=pro.getProperty("gmailuser4");
    	return gmailuser1;
    }
	
	public String getgmailpass()
    {
    	String gmailpassword=pro.getProperty("password");
    	return gmailpassword;
    }

}