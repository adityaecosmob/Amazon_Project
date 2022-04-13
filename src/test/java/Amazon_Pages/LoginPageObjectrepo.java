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
	
	@FindBy(xpath="//a[@id='ap_change_login_claim']")
	 protected WebElement Change;
	
	@FindBy(xpath= "//a[@id='remember_me_learn_more_link']")
	 protected WebElement Details;
	
	@FindBy(xpath= "//p[contains(text(),'Choosing \"Keep me signed in\" reduces the number of')]")
	 protected WebElement Detailstext;
	
	@FindBy(xpath= "//body/div[@id='a-popover-1']/div[1]/div[1]/button[1]/i[1]")
	 protected WebElement clsbutton;
	
	@FindBy(xpath="//span[@id='auth-login-via-otp-btn-announce']")
	 protected WebElement GetOTP;

	@FindBy(xpath="//*[@id=\"authportal-main-section\"]/div[2]/div[1]/div/div/form/div/div[2]/div/div/label/div/label/input")
	 protected WebElement SignInchechbox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	 protected WebElement SignInSubmit;

	 
	public LoginPageObjectrepo (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

}
