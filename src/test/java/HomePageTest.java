
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_Pages.HomePage;
import Amazon_Pages.LoginPage;
import Util.Exceldataprovider;

@Listeners(Util.TestNgListeners.class)
public class HomePageTest extends BrowserTest {

	@Test(priority = 1, description = "To Login Successfully", dataProvider = "LoginCredentials", dataProviderClass = Exceldataprovider.class)
	public void enteringcredentials(String username, String password) throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enteringcredentials(username, password);
	}

	@Test(priority = 2, description = "To order item successfully")
	public void AmzonOrderBooking() throws InterruptedException {
		HomePage homepage_orderitem = new HomePage(driver);
		homepage_orderitem.BookOrder();
	}

	@Test(priority = 3, dataProvider = "phonename", dataProviderClass = Util.Dataprovider.class)
	public void SearchingItem(String PhoneName) {
		HomePage homepage_searchingitem = new HomePage(driver);
		homepage_searchingitem.SearchItem(PhoneName);
	}

}