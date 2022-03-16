package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement texId;
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnLink;
	


	public WebElement getTexId() {
		return texId;
	}


	public WebElement getBtnLink() {
		return btnLink;
	}


	public String confirmation() {
		String attributeValue = getAttributeValue(getTexId());
        click(getBtnLink());
        return attributeValue;
	}

}
