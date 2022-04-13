package Amazon_Pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;

@Listeners(Util.TestNgListeners.class)
public class HomePage extends PageObject { // Class extending Pageobject to access webelements

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
	Actions act = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public HomePage(WebDriver driver) { // To call super constructor from parent class
		super(driver);

	}

	public void BookOrder() throws Exception { // To order item successfully

		// To get and verify current URL
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		wait.until(ExpectedConditions.visibilityOf(GiftCards));
		Assert.assertTrue(CurrentURL.contains("https://www.amazon.in"),
				"URL is not as expected");

		// Using Actions class to perform actions on particular webelements
		act.moveToElement(AccountList).build().perform(); // hovering on particular element
		wait.until(ExpectedConditions.elementToBeClickable(AccountList));
		act.click(AccountList).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(YourOrder));
		Assert.assertEquals(YourOrder.getText(), "Your Orders");
		act.click(YourOrder).build().perform();
		act.click(BuyAgain).build().perform(); // Booking order from YourOrder option
		wait.until(ExpectedConditions.elementToBeClickable(Item));
		Assert.assertTrue(Item.getText().contains("Echo Dot (3rd Gen) - #1 "),"Item name is not as expected");
		act.click(Item).build().perform();
		act.moveByOffset(0, 100);
		act.doubleClick(BuyNow);

	}

	public void SearchItem(String PhoneBrand) // Searching the item on Amazon website
	{
		// Adding 1st item in the cart
		SearchBox.clear();
		SearchBox.sendKeys(PhoneBrand); // sending phone name through sendkeys
		String txtbxvalue = SearchBox.getAttribute("value");
		Assert.assertEquals(txtbxvalue, PhoneBrand);
		SearchBox.submit();
		js.executeScript("arguments[0].scrollIntoView(true);", Ratings);
		wait.until(ExpectedConditions.visibilityOf(Ratings));
		Ratings.click();
//		wait.until(ExpectedConditions.visibilityOf(iphone)); 

		// Using Javascript executer to scroll down to specific element
		js.executeScript("arguments[0].scrollIntoView(true);", iphone);
		String iphonetext = iphone.getText();// Fetching text on webelement
		// Verifying text on webelemnt to buy correct item
		Assert.assertEquals(iphonetext, "Apple iPhone 13 (256GB) - Blue");
		js.executeScript("arguments[0].click();", iphone);
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		
		System.out.println(driver.switchTo().window(child_window).getTitle());
		}
		}
		
		js.executeScript("arguments[0].scrollIntoView(true);", AddToCart);
		wait.until(ExpectedConditions.elementToBeClickable(AddToCart));
		js.executeScript("arguments[0].click();", AddToCart);
		AddedToCart.click();
		wait.until(ExpectedConditions.visibilityOf(CartItem));
		Assert.assertTrue(CartItem.getText().contains("Apple iPhone 13 (256GB) - Blue") , "item is not added to cart");
		// End of adding first element in cart

		// Returning to default window
		driver.switchTo().defaultContent();

		
		// End of adding 2nd element to the cart
	}
}

