package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//td[contains(text(),'Book')]")
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

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTexId() {
		return texId;
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
	public WebElement getTxtBook() {
		return txtBook;
	}


	public void BookHotel(String firstName, String lastName, String address) {
		getText(getTxtBook());
		insertValue(getTxtFirstName(), firstName);
		insertValue(getTxtLastName(), lastName);
		insertValue(getTxtAddress(), address);

	}

	public void cardDetails(String cardNo, String Cardtype, String cardMonth, String cardYear, String cvv) {
		insertValue(getTxtCardNo(), cardNo);
		selectOptionsByVisibleText(getdDnCardType(), Cardtype);
		selectOptionsByVisibleText(getdDnMonth(), cardMonth);
		insertValue(getdDnYear(), cardYear);
		insertValue(getTxtCvv(), cvv);
		getAttributeValue(getTexId());
	}

	public void buttoncl() {
		click(getBtnBookNow());
	}

}
