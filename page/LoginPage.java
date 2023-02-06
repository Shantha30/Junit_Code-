package com.adactin.page;

import com.adactin.locators.LoginPageLocators;
import com.base.utils.BaseClass;

public class LoginPage extends BaseClass{
	
	public static void logIn_Adactin() {
		try {
			String path="C:\\Users\\admin\\Downloads\\Downloads old\\java\\JUnit\\JUnitProject\\src\\test\\resources\\TestData\\HotelData.xlsx";
		BaseClass.dataSend(new LoginPageLocators().getUserName(), getExcelData(path, 2, 0));
		BaseClass.dataSend(new LoginPageLocators().getPassWord(),getExcelData(path,2,1) );
		
		BaseClass.click(new LoginPageLocators().getLogin());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
