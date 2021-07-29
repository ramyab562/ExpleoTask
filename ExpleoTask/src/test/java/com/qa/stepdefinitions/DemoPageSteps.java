package com.qa.stepdefinitions;

import com.qa.pages.DemoPage;
import com.qa.pages.ElementalSelenium;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DemoPageSteps extends TestBase{
	DemoPage demoPage;
	ElementalSelenium elementalSeleniumPage;
	
	@Given("user is on the demo page")
	public void user_is_on_the_demo_page() {
		TestBase.initialization();
		demoPage = new DemoPage(driver);
		System.out.println("User is on demo page ");
	}

	@Then("get the title of the page")
	public void get_the_title_of_the_page() throws InterruptedException {
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals("The Internet", title);
	}

	@Then("user should see the text {string}")
	public void user_should_see_the_text(String text) throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(demoPage.verifyTextIsDisplayed(text));
		System.out.println("Text is displayed "+text);
	}

	@When("user sees the three buttons on the page")
	public void user_sees_the_three_buttons_on_the_page() throws InterruptedException {
		Thread.sleep(2000);
		demoPage.verifyButtonsPresent();
		System.out.println("User can see all the three buttons");
	}

	@Then("user should be able to click on the First button")
	public void user_should_be_able_to_click_on_the_button1() throws InterruptedException {
		Thread.sleep(2000);
		demoPage.clickOnFirstBtn();
		System.out.println("User clicked on first button");
		
	}
	
	@Then("user should be able to click on the Second button")
	public void user_should_be_able_to_click_on_the_button2() throws InterruptedException {
		Thread.sleep(2000);
		demoPage.clickOnSecondBtn();
		System.out.println("User clicked on second button");
	}
	
	@Then("user should be able to click on the Third button")
	public void user_should_be_able_to_click_on_the_button3() throws InterruptedException {
		Thread.sleep(2000);
		demoPage.clickOnThirdBtn();
		System.out.println("User clicked on third button");
	}
	
	@When("user sees the {string} link on the page in the table")
	public void user_sees_the_edit_link_on_the_page(String link) throws InterruptedException {
		Thread.sleep(2000);
		demoPage.linkIsDisplayed(link);
	}

	@Then("user should be able to click on the {string} link on row {string}")
	public void user_should_be_able_to_click_on_the_link(String linkName, String rowNum) throws InterruptedException {
		Thread.sleep(2000);
		demoPage.verifylinkIsClickable(linkName, rowNum);
		System.out.println("Clicked on " +linkName+ " link on row " +rowNum);
	}

	@Then("user should get the cell value from the row number {string} and column number {string}")
	public void user_should_get_the_cell_value_from_the_row_number_and_column_number(String rowNum, String colNum) throws InterruptedException {
		Thread.sleep(2000);
		String cellValue = demoPage.getCellValue(rowNum, colNum);
		System.out.println("Cell Value of row num " +rowNum+ " and column num " +colNum+ " is "+cellValue);
		
	}
	
	@Then("user should get the number of rows in the table")
	public void user_should_get_the_number_of_rows_in_the_table() throws InterruptedException {
		Thread.sleep(2000);
		int rows = demoPage.numOfRows();
		System.out.println("Number of rows in the table : " +rows);
	}

	@Then("user should get the number of columns in the table")
	public void user_should_get_the_number_of_columns_in_the_table() throws InterruptedException {
		Thread.sleep(2000);
		int cols = demoPage.numOfColumns();
		System.out.println("Number of cols in the table : " +cols);
	}

	@Then("user should get the page footer text")
	public void user_should_get_the_page_footer_text() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String footerText = demoPage.getPageFooterText();
		System.out.println("Page footer text : " +footerText);
	}

	@When("user clicks the link on the page footer")
	public void user_clicks_the_link_on_the_page_footer() throws InterruptedException {
		Thread.sleep(2000);
		demoPage.clickOnFooterLink();
		System.out.println("User clicked on Page footer link");
	}

	@Then("user gets Title of new Page")
	public void user_gets_Title_of_new_Page() throws InterruptedException {
		Thread.sleep(2000);
		elementalSeleniumPage = new ElementalSelenium(driver);
		Thread.sleep(2000);
		String newPageTitle = driver.getTitle();
		System.out.println("newPageTitle : "+newPageTitle);
		Thread.sleep(2000);
		Assert.assertEquals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro", newPageTitle);
	}

	@Then("close the browser")
	public void close_the_browser() {
		demoPage.quitBrowser();
	}

}
