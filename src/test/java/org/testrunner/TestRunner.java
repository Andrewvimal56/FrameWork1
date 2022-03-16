package org.testrunner;

import org.baseclass.ReportsExecution;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\AdactinBooking.feature", glue = "org.stepDefination", dryRun = false, monochrome = true, plugin = {
		"rerun:src\\test\\resources\\failed.txt", "junit:src\\test\\resources\\Reports\\Adactin.xml",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\AdactinJs.json" }, tags = { "@Reg", "@Smoke" })
public class TestRunner {
	@AfterClass
	public static void afterExecution() {
		ReportsExecution
				.convertReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\AdactinJs.json");
	}

}
