package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath="//h4[contains(text(),'Get financial advice')]")
	WebElement GetFinancialAdviceText;
	
	@FindBy(xpath="//span[contains(text(),'Book Consultation')]")
	WebElement BookConsultationBtn;
	
	public ContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyGetFinancialAdvicetext(){
		return GetFinancialAdviceText.isDisplayed();
	}

	public boolean verifyBookConsultationBtn(){
		return BookConsultationBtn.isDisplayed();
	}
}
