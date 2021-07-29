package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ElementalSelenium extends TestBase {
	
	public ElementalSelenium(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
}
