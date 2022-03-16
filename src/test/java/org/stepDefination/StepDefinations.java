package org.stepDefination;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.pojoclass.AdactinPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinations extends BaseClass {
	AdactinPojoClass adactin;

	@Given("User launch Adactin Hotel Web Application")
	public void user_launch_Adactin_Hotel_Web_Application() {

	}

	@Then("Login Page is diplayed")
	public void login_Page_is_diplayed() {
		adactin = new AdactinPojoClass();
		String text = getText(adactin.getTxtAdactin());
		Assert.assertEquals("Verify Login Page", "Adactin Launches The Adactin Hotel App!", text);
	}

	@When("User Enter Valid UserName and Password")
	public void user_Enter_Valid_UserName_and_Password() {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtName(), "Andrew07");
		insertValue(adactin.getTxtPassword(), "1283YR");
	}

	@When("User Clicks Login Button")
	public void user_Clicks_Login_Button() {
		adactin = new AdactinPojoClass();
		click(adactin.getBtnLogin());
	}

	@Then("User Verify  Search Hotel Page is displayed")
	public void user_Verify_Search_Hotel_Page_is_displayed() {
		adactin = new AdactinPojoClass();
		String text = getText(adactin.getTxtSearch());
		Assert.assertEquals("Verify Search Hotel Page",
				"Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
	}

	@When("User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom")
	public void user_Enter_Valid_Location_Hotels_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_AdultPerRoom_and_ChildrenPerRoom() {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getdDnLocation(), " Paris");
		insertValue(adactin.getdDnHotels(), "Hotel Sunshine");
		insertValue(adactin.getdDnRoomType(), "Super Deluxe");
		insertValue(adactin.getdDnRoomNo(), "3 - Three");
		clearTextbox(adactin.getTxtCheckIn());
		insertValue(adactin.getTxtCheckIn(), "12/03/2022");
		clearTextbox(adactin.getTxtCheckOut());
		insertValue(adactin.getTxtCheckOut(), "15/03/2022");
		insertValue(adactin.getdDnAduldRoom(), "4 - Four");
		insertValue(adactin.getdDnChildRoom(), "3 - Three");
	}

	@When("User Clicks Search Button")
	public void user_Clicks_Search_Button() {
		adactin = new AdactinPojoClass();
		click(adactin.getBtnSearch());
	}

	@Then("User Verify Select Hotel Page is Displayed")
	public void user_Verify_Select_Hotel_Page_is_Displayed() {
		adactin = new AdactinPojoClass();
		String text = getText(adactin.getTxtSelect());
		boolean contains = text.contains("Select");
		System.out.println(contains);
	}

	@When("User Click Radio Button And User Click Continue")
	public void user_Click_Radio_Button_And_User_Click_Continue() {
		adactin = new AdactinPojoClass();
		click(adactin.getBtnRadio());
		click(adactin.getBtnContinue());
	}

	@Then("User Verify Book a Hotel Page is Displayed")
	public void user_Verify_Book_a_Hotel_Page_is_Displayed() {
		adactin = new AdactinPojoClass();
		String text = getText(adactin.getTxtBook());
		boolean contains = text.contains("Book");
		System.out.println(contains);
	}

	@When("User Enter Valid FirstName, LastName and BillingAddress")
	public void user_Enter_Valid_FirstName_LastName_and_BillingAddress() {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtFirstName(), "Vimal");
		insertValue(adactin.getTxtLastName(), "Andrew");
		insertValue(adactin.getTxtAddress(), "Choolaimedu,Chennai-10");
	}

	@When("User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber")
	public void user_Enter_Valid_CreditCardNo_and_Select_CardType_Month_Year_and_Enter_Valid_CVVNumber() {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtCardNo(), "9876543212345670");
		insertValue(adactin.getdDnCardType(), "American Express");
		insertValue(adactin.getdDnMonth(), "December");
		insertValue(adactin.getdDnYear(), "2022");
		insertValue(adactin.getTxtCvv(), "5432");
	}

	@When("User Click Book Now Button")
	public void user_Click_Book_Now_Button() {
		adactin = new AdactinPojoClass();
		click(adactin.getBtnBookNow());
	}

	@Then("User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned")
	public void user_Verify_Booking_Confirmation_Page_is_Displayed_and_Confirmation_Order_ID_is_Showned() {
		adactin = new AdactinPojoClass();
		String value = getAttributeValue(adactin.getTexId());
		System.out.println(value);
	}

	@When("User Enter Valid UserName and Password With DataTable")
	public void user_Enter_Valid_UserName_and_Password_With_DataTable(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		insertValue(adactin.getTxtName(), asList.get(0));
		insertValue(adactin.getTxtPassword(), asList.get(1));
	}

	@When("User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom With DataTable")
	public void user_Enter_Valid_Location_Hotels_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_AdultPerRoom_and_ChildrenPerRoom_With_DataTable(
			io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();
		insertValue(adactin.getdDnLocation(), asLists.get(0).get(0));
		insertValue(adactin.getdDnHotels(), asLists.get(0).get(1));
		insertValue(adactin.getdDnRoomType(), asLists.get(0).get(2));
		insertValue(adactin.getdDnRoomNo(), asLists.get(1).get(0));
		insertValue(adactin.getTxtCheckIn(), asLists.get(1).get(1));
		insertValue(adactin.getTxtCheckOut(), asLists.get(1).get(2));
		insertValue(adactin.getdDnAduldRoom(), asLists.get(2).get(0));
		insertValue(adactin.getdDnChildRoom(), asLists.get(2).get(1));
	}

	@When("User Enter Valid FirstName, LastName and BillingAddress With DataTable")
	public void user_Enter_Valid_FirstName_LastName_and_BillingAddress_With_DataTable(
			io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		insertValue(adactin.getTxtFirstName(), asMap.get("FirstName"));
		insertValue(adactin.getTxtLastName(), asMap.get("LastName"));
		insertValue(adactin.getTxtAddress(), asMap.get("Billing Address"));
	}

	@When("User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber With DataTable")
	public void user_Enter_Valid_CreditCardNo_and_Select_CardType_Month_Year_and_Enter_Valid_CVVNumber_With_DataTable(
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		insertValue(adactin.getdDnCardType(), asMaps.get(1).get("CardType"));
		insertValue(adactin.getdDnMonth(), asMaps.get(0).get("Month"));
		insertValue(adactin.getdDnYear(), asMaps.get(1).get("Year"));
		insertValue(adactin.getTxtCvv(), asMaps.get(0).get("CVV"));
		insertValue(adactin.getTxtCardNo(), asMaps.get(0).get("CardNo"));

	}

	@When("User Enter Valid {string} and {string}")
	public void user_Enter_Valid_and(String string, String string2) {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtName(), string);
		insertValue(adactin.getTxtPassword(), string2);
	}

	@When("User Enter Valid {string},{string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_Enter_Valid_and(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getdDnLocation(), string);
		insertValue(adactin.getdDnHotels(), string2);
		insertValue(adactin.getdDnRoomType(), string3);
		insertValue(adactin.getdDnRoomNo(), string4);
		insertValue(adactin.getTxtCheckIn(), string5);
		insertValue(adactin.getTxtCheckOut(), string6);
		insertValue(adactin.getdDnAduldRoom(), string7);
		insertValue(adactin.getdDnChildRoom(), string8);

	}

	@When("User Enter Valid {string}, {string} and {string}")
	public void user_Enter_Valid_and(String string, String string2, String string3) {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtFirstName(), string);
		insertValue(adactin.getTxtLastName(), string2);
		insertValue(adactin.getTxtAddress(), string3);
	}

	@When("User Enter Valid {string} and Select{string} , {string}, {string} and Enter Valid {string}")
	public void user_Enter_Valid_and_Select_and_Enter_Valid(String string, String string2, String string3,
			String string4, String string5) {
		adactin = new AdactinPojoClass();
		insertValue(adactin.getTxtCardNo(), string);
		insertValue(adactin.getdDnCardType(), string2);
		insertValue(adactin.getdDnMonth(), string3);
		insertValue(adactin.getdDnYear(), string4);
		insertValue(adactin.getTxtCvv(), string5);
	}

}