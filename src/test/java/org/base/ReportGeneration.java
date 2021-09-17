package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	public static  void generateJvmReport(String jsonFile) {
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target\\CucumberReport");
		Configuration config=new Configuration(file, "SampleProject");
		config.addClassifications("platform", "win10");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("SprintNo", "5");
		List<String>li=new ArrayList<String>();
		li.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(li, config);
		builder.generateReports();
		
	}
}
