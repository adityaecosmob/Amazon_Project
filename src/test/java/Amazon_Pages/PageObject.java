package Amazon_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	WebDriver driver; // This is driver reference from Webdriver class

	// Here, declaring all the webelements by using @FindBy annotation
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	protected WebElement AccountList;

	@FindBy(xpath = "//h2[contains(text(),'Your Orders')]")
	protected WebElement YourOrder;

	@FindBy(xpath = "//*[@id='orderTypeMenuContainer']/ul/li[3]/span/a")
	protected WebElement BuyAgain;

	@FindBy(xpath = "//body/div[@id='a-page']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/span[2]")
	protected WebElement Item;

	@FindBy(xpath = "//input[@id='buy-now-native-button-B07PFFMP9P-e2oq6iqzmai']")
	protected WebElement BuyNow;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	protected WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
	protected WebElement BuyAgainmod;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
	protected WebElement Coupons;

	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	protected WebElement GiftCards;

	@FindBy(xpath = "//a[@id='a-autoid-0-announce']")
	protected WebElement parent;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	protected WebElement Friend;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	protected WebElement others;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")
	protected WebElement AmazonPay;
	
	@FindBy(xpath = "//*[@id=\"p_72/1318476031\"]")
	protected WebElement Ratings;

	@FindBy(xpath = "//*[@id='attach-sidesheet-view-cart-button']/span/input")
	protected WebElement AddedToCart;
	
	
	@FindBy(xpath = "//span[@class='a-truncate-cut']")
	protected WebElement CartItem;
	
	@FindBy(xpath = "//*[@id=\"acrPopover\"]/span[1]/a/i[1]")
	protected WebElement HoverRating_iphoneblue;

	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[11]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	protected WebElement iphone;
	
	@FindBy(xpath = "//span[contains(text(),'Apple iPhone 13 (128GB) - Midnight')]")
	protected WebElement Apple_iphone13;

	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	protected WebElement AddToCart;

	@FindBy(xpath = "//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	protected WebElement CheckoutBtn;

    //Inititating all webelements  through constructor
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
