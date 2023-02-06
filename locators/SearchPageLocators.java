package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.utils.BaseClass;

public class SearchPageLocators extends BaseClass {
	public SearchPageLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(css= "#room_nos")
	private WebElement noOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement adultPerRoom;

	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(css = "#Submit")
	private WebElement search;
	
	
	@FindBy(xpath = "//span[@class='reg_error']")
	private WebElement error;
	public WebElement getError() {
		return error;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSearch() {
		return search;
	}

}
