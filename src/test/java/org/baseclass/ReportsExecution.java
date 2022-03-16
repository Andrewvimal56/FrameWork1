package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportsExecution {

	public static void convertReport( String jsonFile) {
		File reports = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports");
		Configuration configuratin = new Configuration(reports, "AdactinWebAutomation");
		configuratin.addClassifications("Platform", "Windows");
		configuratin.addClassifications("Version", "Windows 10");
		configuratin.addClassifications("Sprint", "Build");
		configuratin.addClassifications("Build", "ADA98777");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuratin);
		builder.generateReports();
	}
}
