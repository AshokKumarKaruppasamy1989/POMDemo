package testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest extends TestBase {
	
	HomePage homepage;
	SearchResultPage searchresultpage;
	ShoppingCartPage shoppingcartpage;
	CheckOutPage checkoutpage;

	@BeforeTest
	public void setUp() {
		initialize();
	}

	@Test
	public void addItemTest() throws InterruptedException {
		
		homepage = new HomePage();
		searchresultpage = new SearchResultPage();
		homepage.searchItem("Parry Hotter");
		Thread.sleep(3000);
		searchresultpage.viewItemDetail();
		Thread.sleep(3000);
		searchresultpage.addToCart();

	}
	
	@Test
	public void checkoutTest( ) throws InterruptedException {
		shoppingcartpage = new ShoppingCartPage();
		boolean itemAdded = shoppingcartpage.isItemAdded();
		Assert.assertTrue(itemAdded);
		Thread.sleep(3000);
		shoppingcartpage.includeCheckbox();
		shoppingcartpage.doCheckout();		
	}
	
	@Test
	public void buyItemstest() throws InterruptedException {
		checkoutpage = new CheckOutPage();
		Thread.sleep(3000);
		checkoutpage.enterName("testuser");
		checkoutpage.enterAddress("test address");
		checkoutpage.selectSinglepackageRadioBtn();
		checkoutpage.buyTheprodut();
	}
}
