package com.junit.sample;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.utils.BaseClass;

public class AdactinLoginPage extends BaseClass{
	
	@BeforeClass
	public static void openBrowser() {
		browserOpen("chrome");
	}
	@Before
	public void urlLaunch() {
		loadUrl("https://adactinhotelapp.com/index.php");
	}
	@Test
	public void login_With_ValidUserName_ValidPassword() {
		try {
		WebElement userName = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login"));
		
		dataSend(userName, "Muthulakshmi");
		dataSend(passWord, "Viji@1703");
		click(login);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@After
	public void logOutOrAuthError() {
		try {
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(logOut));
		if(logOut.isDisplayed()) {
			System.out.println("User logged into the Site");
			click(logOut);
		}
	}
	catch(NoSuchElementException e) {
		WebElement authError = driver.findElement(By.xpath("//div[@class='auth_error']"));
		if (authError.isDisplayed()) {
			System.out.println("Unable to login, please check credentials");
		}
	}
	}
	@AfterClass
	public static void browserClose() {
		pageClose();
	}
}
