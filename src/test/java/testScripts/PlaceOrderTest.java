package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase {
	
	HomePage homepage;
	SearchResultPage searchresultpage;

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
}
