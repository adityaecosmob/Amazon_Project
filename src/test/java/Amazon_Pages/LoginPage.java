package Amazon_Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends LoginPageObjectrepo {

	// Creating instance of WebdriverWait class
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public LoginPage(WebDriver driver) {
		super(driver); // calling the superconstructor to recognize the initiated webelements
	}

	public void enteringcredentials(String username, String password) throws InterruptedException {
		// Procedure to login through credentials
		SignIn.click();
		Thread.sleep(5000);
		userphone.clear();
		userphone.sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)); // waiting till element found to be clickable
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(Password));
		Password.clear();
		Password.sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(SignInSubmit)); // waiting till element found to be clickable
		SignInSubmit.click(); // After clicking successful sign in will be done
	}

}
