package Amazon_Pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends LoginPageObjectrepo {

	// Creating instance of WebdriverWait class
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	JavascriptExecutor js=(JavascriptExecutor) driver;

	public LoginPage(WebDriver driver) {
		super(driver); // calling the superconstructor to recognize the initiated webelements
	}

	public void enteringcredentials(String username, String password) throws InterruptedException {
		// Procedure to login through credentials
		String txtonbutton = SignIn.getText();
		System.out.println(txtonbutton);
		Assert.assertTrue(txtonbutton.contains("Sign in"));
		SignIn.click();
		wait.until(ExpectedConditions.visibilityOf(userphone));
		Assert.assertTrue(userphone.isDisplayed());
		Assert.assertTrue(ContinueButton.isDisplayed());
		userphone.clear();
		userphone.sendKeys(username);
		String txtboxvalue1 = userphone.getAttribute("value");
		Assert.assertEquals(txtboxvalue1, username,"Entered Username is wrong");
		js.executeScript("arguments[0].click();", ContinueButton);
//		wait.until(ExpectedConditions.visibilityOf(GetOTP));
		Assert.assertTrue(GetOTP.isDisplayed(), "Get an OTP is not displayed yet");
		String otp = GetOTP.getText();
		Assert.assertEquals(otp,"Get an OTP on your phone","Text on otp button is not as expected");
		Assert.assertEquals(SignInchechbox.isSelected(), false);
        Assert.assertEquals(Details.isDisplayed(), true);
        Details.click();
        Assert.assertEquals(Detailstext.getText().contains("Choosing \"Keep me signed in\" reduces the number of"), true);
        clsbutton.click();
        Assert.assertEquals(Change.isDisplayed(), true);
		Password.clear();
		Password.sendKeys(password);
		String pass = Password.getAttribute("value");
        Assert.assertEquals(pass,password, "Entered password is not as expected" );
		js.executeScript("arguments[0].click();", SignInSubmit); // After clicking successful sign in will be done

	}

}
