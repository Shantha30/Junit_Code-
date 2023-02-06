package com.adactin.testexe;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adactin.page.LoginPage;
import com.adactin.page.SearchHotelPage;
import com.base.utils.BaseClass;

public class LoginPageTest extends BaseClass{
	@BeforeClass
	public static void openBrowser() {
		browserOpen("chrome");
	}
	@Before
	public void urlLaunch() {
		loadUrl("https://adactinhotelapp.com/index.php");
	}
	
	@Test
	public void login() {
		LoginPage.logIn_Adactin();
	}
	
}
