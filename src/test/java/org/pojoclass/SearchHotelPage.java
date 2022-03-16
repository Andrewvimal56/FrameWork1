package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Search Hotel')]")
	private WebElement txtSearch;
	@FindBy(id = "location")
	private WebElement dDnLocation;
	@FindBy(id = "hotels")
	private WebElement dDnHotels;
	@FindBy(id = "room_type")
	private WebElement dDnRoomType;
	@FindBy(id = "room_nos")
	private WebElement dDnRoomNo;
	@FindBy(id = "datepick_in")
	private WebElement txtCheckIn;
	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;
	@FindBy(id = "adult_room")
	private WebElement dDnAduldRoom;
	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;
	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnAduldRoom() {
		return dDnAduldRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public void searchHotel(String location, String hotels, String roomType, String roomNo, String checkIn,
			String checkOut, String adultRoom, String childRoom) {
		getText(getTxtSearch());
		selectOptionsByVisibleText(getdDnLocation(), location);
		selectOptionsByVisibleText(getdDnHotels(), hotels);
		selectOptionsByVisibleText(getdDnRoomType(), roomType);
		selectOptionsByVisibleText(getdDnRoomNo(), roomNo);
		clearTextbox(getTxtCheckIn());
		insertValue(getTxtCheckIn(), checkIn);
		clearTextbox(getTxtCheckOut());
		insertValue(getTxtCheckOut(), checkOut);
		selectOptionsByVisibleText(getdDnAduldRoom(), adultRoom);
		selectOptionsByVisibleText(getdDnChildRoom(), childRoom);
		click(getBtnSearch());
	}

	public void buttonClick() {
		
	}

}
