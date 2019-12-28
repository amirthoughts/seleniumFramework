package com.demoqa.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoqa.qa.base.TestBase;
import com.demoqa.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	public SoftAssert assertion;
	public HomePage homePage;
	public Logger log;
	
	@BeforeClass
	public void instantiatePage() {
		log = Logger.getLogger(HomePageTest.class);
		homePage = new HomePage(driver);
		assertion = new SoftAssert();
	}
	
	@Test
	public void validateUI() {
		log.info("****************************************** start validateUI - testcase ***********************");
		log.info("verifying logo of the page");
		homePage.verifyLogo(assertion);
		log.warn("validation is going to end");
		assertion.assertAll();
		log.info("****************************************** end validateUI - testcase ***********************");
	}
	
	
}
