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

	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='yourOrders']/div[@id='yourOrdersContent']/div[@id='ordersContainer']/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]/a[1]/div[1]")
	protected WebElement BuyAgain;

	@FindBy(xpath = "//body/div[@id='a-page']/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/img[1]")
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
	protected WebElement sibling;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	protected WebElement spouse;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	protected WebElement Collegue;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
	protected WebElement others;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")
	protected WebElement AmazonPay;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[6]")
	protected WebElement PetSupplies;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[7]")
	protected WebElement AmazonBasics;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[8]")
	protected WebElement Groceries;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[9]")
	protected WebElement HomeImprovement;

	@FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[10]")
	protected WebElement CustService;

	@FindBy(xpath = "//span[contains(text(),'Apple iPhone 13 (256GB) - Blue')]")
	protected WebElement iphone;

	@FindBy(xpath = "//div")
	protected List<WebElement> allURLs;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	protected WebElement AddToCart;

	@FindBy(xpath = "//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	protected WebElement CheckoutBtn;

    //Inititating all webelements  through constructor
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
