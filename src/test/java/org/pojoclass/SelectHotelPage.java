package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Select Hotel')]")
	private WebElement txtSelect;
	@FindBy(id = "radiobutton_0")
	private WebElement btnRadio;
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public WebElement getTxtSelect() {
		return txtSelect;
	}

	public void selectHotelPage() {
		getText(getTxtSelect());
		click(getBtnRadio());
		click(getBtnContinue());
	}
}
