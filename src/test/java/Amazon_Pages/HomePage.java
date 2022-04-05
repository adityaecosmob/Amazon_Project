package Amazon_Pages;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(Util.TestNgListeners.class)
public class HomePage extends PageObject {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public void BookOrder() throws InterruptedException {

		// Fetching all weblinks from Amazon website
        driver.getCurrentUrl();
		System.out.println("Total links on the Wb Page: " + allURLs.size());
		for(WebElement url:allURLs) {
			System.out.println(url.getText());
		}

		// Using Actions class to perform actions on particular webelements
		Actions act = new Actions(driver);
		act.moveToElement(AccountList).build().perform(); //hovering on particular element
		wait.until(ExpectedConditions.elementToBeClickable(AccountList));
		act.click(AccountList).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(YourOrder));
		act.click(YourOrder).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(BuyAgain));
		act.click(BuyAgain).build().perform(); // Booking order from YourOrder option
		wait.until(ExpectedConditions.elementToBeClickable(Item));
		act.click(Item).build().perform();
		act.moveByOffset(0, 100);
		act.doubleClick(BuyNow);

	}

	public void SearchItem(String PhoneBrand) // Searching the item on Amazon website
	{
		SearchBox.clear();             
		SearchBox.sendKeys(PhoneBrand); // sending phone name through sendkeys
		SearchBox.submit();
		wait.until(ExpectedConditions.visibilityOf(iphone)); // waiting till the element gets visible on UI

		// Using Javascript executer to scroll down to specific element
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iphone);
		String iphonetext = iphone.getText();// Fetching text on webelement

		// Verifying text on webelemnt to buy correct item
		Assert.assertEquals(iphonetext ,"Apple iPhone 13 (256GB) - Blue") ;
			iphone.click();
		
	}
}
