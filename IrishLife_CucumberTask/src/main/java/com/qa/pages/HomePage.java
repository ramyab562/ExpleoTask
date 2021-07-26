package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	Actions actions = new Actions(driver);
	
	//Page Factory or Object Repository(OR)
	@FindBy(xpath="//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll']")
    WebElement CookieOption;

	@FindBy(xpath="//span[contains(text(),'Contact')]")
	WebElement ContactTab;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement LogInBtn;
	
	@FindBy(xpath="//span[contains(text(),'Find out more')]")
	WebElement FindOutMore;
	
	@FindBy(xpath="//h3[contains(text(),'Life Insurance')]")
	WebElement LifeInsuranceTab;
	
	@FindBy(xpath="//span[contains(text(),'Introduction to Life Insurance')]")
	WebElement IntroductiontoLifeInsuranceOption;
	
	//Initializing the above web elements(in this class) with driver using PageFactory initElements Method
	//Initializing the page Objects:
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	//Accept Cookies
	public void acceptCookieOption(){
		CookieOption.click();
	}
	
	//Get Page Title
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	//Navigate to new page from top Navigation header
	public void clickOnTopNavigationLink(String topNavigation){
		WebElement topNavigationLink = driver.findElement(By.xpath("//span[contains(text(),'"+topNavigation+"')]"));
		actions.moveToElement(topNavigationLink).click().perform();
	}
	
	//Click on a link in the page
	public void clickOnLink(String navigationLink){
		WebElement link = driver.findElement(By.xpath("//span[contains(text(),'"+navigationLink+"')]"));
		actions.moveToElement(link).click().perform();
		
	}
	
}
