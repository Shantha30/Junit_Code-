package com.adactin.testexe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.adactin.page.SearchHotelPage;
import com.base.utils.BaseClass;

public class SearchPageExe extends BaseClass {
	@BeforeClass
	public static void openBrowser() {
		browserOpen("chrome");
	}
	@Before
	public void urlLaunch() {
		loadUrl("https://adactinhotelapp.com/index.php");
	}
	@Test
	public void searchHotel() {
			SearchHotelPage.search_Page();
	}
	@After
	public void confirmHotel() {
		SearchHotelPage.submitHotel();
	}
	@AfterClass
	public static void browserClose() {
		pageClose();
	}
}


