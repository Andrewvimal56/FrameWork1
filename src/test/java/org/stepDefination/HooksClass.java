package org.stepDefination;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution() {
		getDriverLoadUrl("https://adactinhotelapp.com/");
	}

	@After
	public void afterExecution(Scenario s) {

		TakesScreenshot sShot = (TakesScreenshot) driver;
		byte[] bs = findElementById("order_no").getScreenshotAs(OutputType.BYTES);
		byte[] as = sShot.getScreenshotAs(OutputType.BYTES);
		s.embed(as, "img/png");
		s.embed(bs, "img/png");
		closeWindows();
	}

}
