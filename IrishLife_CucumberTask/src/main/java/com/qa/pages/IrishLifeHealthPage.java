package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class IrishLifeHealthPage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'STEP 1 OF 2')]")
	WebElement IWantToCoverText;
	
	public IrishLifeHealthPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyText(String text){
		return IWantToCoverText.isDisplayed();
	}
	

}
