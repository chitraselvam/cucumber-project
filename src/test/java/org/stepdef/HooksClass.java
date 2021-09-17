package org.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	@Before
	public void beforeScenario() {
		System.out.println("Execute before each scenario");
	}
	@After
	public void afterScenario() {
		System.out.println("execute after each scenario");
		

	}

}
