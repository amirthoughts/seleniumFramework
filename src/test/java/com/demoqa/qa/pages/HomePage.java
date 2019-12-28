package com.demoqa.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.demoqa.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#logo-events a")
	WebElement demoQaLogo;
	
	public void verifyLogo(SoftAssert assertion) {
		assertion.assertTrue(demoQaLogo.isDisplayed(), "logo is not displayed");
		assertion.assertAll();
	}
	
	
	
	
}
