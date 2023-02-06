package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.utils.BaseClass;

public class LoginPageLocators extends BaseClass{
	
//	public LoginPageLocators() {
//		PageFactory.initElements(driver, this);
//	}

	//@FindBy, @FindBys & @FindAll
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement passWord;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	// xpath -> //input[@id='password' and @name='password']
//	@FindBys({ //works only when both condition are true(like a && operato)
//		@FindBy(id="password"), 
//		@FindBy(name="password")
//	})
//	private WebElement passWord;
	
//	@FindAll({ //works either one condition is true(like a || operator)
//		@FindBy(id="login"), 
//		@FindBy(name="login")
//	})
//	private WebElement login;
}
