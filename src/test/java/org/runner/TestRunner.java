package org.runner;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login.feature"},glue= {"org.stepdef"},monochrome=true,dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin= {"pretty","html:C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target",
		"json:C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target\\adact.json",
		"junit:C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target\\adact.xml",
		"json:C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target\\CucumberReport\\sample.json"})
public class TestRunner {
	@AfterClass
	public static void afterclass() {
		ReportGeneration.generateJvmReport("C:\\Users\\Dell\\eclipse-workspace\\CucumberFirstDay\\target\\CucumberReport\\sample.json");
		

	}
	

}
