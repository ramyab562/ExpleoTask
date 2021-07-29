package com.qa.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class DemoPage extends TestBase {
	Actions actions = new Actions(driver);
	
	//Page Factory or Object Repository(OR)
	@FindBy(xpath="//h3[contains(text(),'Challenging DOM')]")
    WebElement text;

	@FindBy(className="button")
	//@FindBy(xpath="a[@class='button']")
	//@FindBy(xpath="//span[contains(text(),'Contact')]")
	WebElement FirstBtn;
	
	//@FindBy(className="button alert")
	@FindBy(xpath="//a[contains(@class,'alert')]")
	WebElement SecondBtn;
	
	//@FindBy(className="button success")
	@FindBy(xpath="//a[contains(@class,'success')]")
	WebElement ThirdBtn;
	
	//Initializing the above web elements(in this class) with driver using PageFactory initElements Method
	//Initializing the page Objects:
	public DemoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	//Get Page Title
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyTextIsDisplayed(String text){
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'"+text+"')]"));
		boolean result = element.isDisplayed();
		return result;
	}
	
	public String verifyText(String text){
		WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'"+text+"')]"));
		String resultText = element.getText();
		return resultText;
	}
	
	public void verifyButtonsPresent(){
		boolean fb = FirstBtn.isDisplayed();
		boolean sb = SecondBtn.isDisplayed();
		boolean tb = ThirdBtn.isDisplayed();
		if (fb == true && sb == true && tb == true){
			System.out.println("All the three buttons are displayed");
		} else {
			System.out.println("All the three buttons are not displayed");
		}
	}
	
	public void clickOnFirstBtn(){
		actions.moveToElement(FirstBtn).click().perform();
	}
	
	public void clickOnSecondBtn(){
		actions.moveToElement(SecondBtn).click().perform();
	}
	
	public void clickOnThirdBtn(){
		actions.moveToElement(ThirdBtn).click().perform();
	}
	
	public void linkIsDisplayed(String link){
		WebElement linkElement = driver.findElement(By.xpath("//*[@id='content']//table/tbody/tr[1]/td[7]/a[contains(text(),'"+link+"')]"));
		linkElement.isDisplayed();
	}
	
	public void verifylinkIsClickable(String linkName, String rowNum){
		WebElement linkElement = driver.findElement(By.xpath("//*[@id='content']//table/tbody/tr["+rowNum+"]/td[7]/a[contains(text(),'"+linkName+"')]"));
		actions.moveToElement(linkElement).click().perform();
	}
	
	public String getCellValue(String rowNum, String colNum){
		WebElement cell = driver.findElement(By.xpath("//*[@id='content']//table/tbody/tr["+rowNum+"]/td["+colNum+"]"));
		String cellValue = cell.getText();
		return cellValue;
	}
	
	public int numOfRows(){
	    //No.of rows 
	    List<WebElement> rows = driver.findElements(By.xpath("//*[@id='content']//table/tbody/tr/td[1]")); 
	    System.out.println("No of rows are : " + rows.size());
	    return rows.size();
	}

	public int numOfColumns(){
	    //No.of columns 
	    List<WebElement> cols = driver.findElements(By.xpath("//*[@id='content']//table/thead/tr/th")); 
	    System.out.println("No of columns are : " + cols.size());
	    return cols.size();
	}
	
	public String getPageFooterText() {
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Powered by')]"));
		String resultText = element.getText();
		return resultText;
	}
	
	public void clickOnFooterLink() {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]"));
		actions.moveToElement(element).click().perform();
	}
	
	
   	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser closed");
		
	}
	
}


