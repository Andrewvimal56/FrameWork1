package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojoClass extends BaseClass{
	public AdactinPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Adactin Launches The Adactin Hotel App! ']")
	private WebElement txtAdactin;
	@FindBy(id = "username")
	private WebElement txtName;
	@FindBy(id = "password")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;@FindBy(xpath = "//td[contains(text(),'Search Hotel')]")
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
	@FindBy(xpath = "//td[contains(text(),'Select Hotel')]")
	private WebElement txtSelect;
	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;
	@FindBy(id = "continue")
	private WebElement btnContinue;@FindBy(xpath="//td[contains(text(),'Book')]")
    private WebElement txtBook;
    @FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCardNo;
	@FindBy(id = "cc_type")
	private WebElement dDnCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement dDnMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement dDnYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;
	@FindBy(id = "book_now")
	private WebElement btnBookNow;
	@FindBy(id = "order_no")
	private WebElement texId;
	public WebElement getTxtAdactin() {
		return txtAdactin;
	}
	public WebElement getTxtName() {
		return txtName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getTxtSearch() {
		return txtSearch;
	}
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
	public WebElement getTxtSelect() {
		return txtSelect;
	}
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtBook() {
		return txtBook;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCardNo() {
		return txtCardNo;
	}
	public WebElement getdDnCardType() {
		return dDnCardType;
	}
	public WebElement getdDnMonth() {
		return dDnMonth;
	}
	public WebElement getdDnYear() {
		return dDnYear;
	}
	public WebElement getTxtCvv() {
		return txtCvv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getTexId() {
		return texId;
	}
	
	

}
