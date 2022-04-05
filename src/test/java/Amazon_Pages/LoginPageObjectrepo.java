package Amazon_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 abstract class LoginPageObjectrepo {
	
WebDriver driver;
	
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	 protected WebElement SignIn;
	
	@FindBy (xpath="//input[@id='ap_email']")
	 protected WebElement userphone;
	
	@FindBy(xpath="//input[@id='continue']")
	 protected WebElement ContinueButton;
	
	@FindBy(xpath="//a[@id='auth-fpp-link-bottom']")
	 protected WebElement ForgetPass;
	
	@FindBy(xpath="//input[@id='ap_password']")
	 protected WebElement Password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	 protected WebElement SignInSubmit;

	 
	public LoginPageObjectrepo (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

}
