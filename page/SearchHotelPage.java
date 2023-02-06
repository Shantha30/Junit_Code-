package com.adactin.page;

import org.openqa.selenium.WebElement;
import com.adactin.locators.SearchPageLocators;
import com.base.utils.BaseClass;

public class SearchHotelPage extends BaseClass {
	public static void search_Page() {
		LoginPage.logIn_Adactin();
		try {
			String path = "C:\\Users\\admin\\Downloads\\Downloads old\\java\\JUnit\\JUnitProject\\src\\test\\resources\\TestData\\HotelData.xlsx";
			BaseClass.impWait(30);
			SearchPageLocators sp=new SearchPageLocators();
			BaseClass.selectByIndex(sp.getLocation(), 2);
			BaseClass.selectByIndex(sp.getHotels(), 1);
			BaseClass.selectByIndex(sp.getRoomType(), 3);
			BaseClass.selectByIndex(sp.getNoOfRooms(), 1);
			BaseClass.dataSend(sp.getCheckInDate(), getExcelData(path, 2, 2));
			BaseClass.dataSend(sp.getCheckOut(), getExcelData(path, 2, 3));
			BaseClass.selectByIndex(sp.getAdultPerRoom(), 2);
			BaseClass.selectByIndex(sp.getChildPerRoom(), 1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void submitHotel() {
		try {
			WebElement submit = new SearchPageLocators().getSearch();

			if (submit.isDisplayed()) {
				System.out.println("Hotel Found - Confirm the Selected Hotel");
				click(submit);
			}
		} catch (Exception e) {
			WebElement enterData = new SearchPageLocators().getError();
			if (enterData.isDisplayed()) {
				System.out.println("Entered the mandatory Field");
			}
		}
	}

}
