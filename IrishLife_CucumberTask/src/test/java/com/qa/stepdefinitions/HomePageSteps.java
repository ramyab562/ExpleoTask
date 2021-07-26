package com.qa.stepdefinitions;

import org.junit.Assert;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.IrishLifeHealthPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends TestBase{
	HomePage homePage;
	ContactPage contactPage;
	IrishLifeHealthPage irishLifeHealthPage;
	
	@Given("user is on the Irish Life website homepage")
	public void user_is_on_the_Irish_Life_website_homepage() {
		TestBase.initialization();
		homePage = new HomePage(driver);
		homePage.acceptCookieOption();
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}

	@When("user clicks on the {string} link in the top navigation")
	public void user_clicks_on_the_link_in_the_top_navigation(String topNavigationOption) {
		homePage.clickOnTopNavigationLink(topNavigationOption);
		System.out.println("User navigated to "+topNavigationOption+" Page");

	}

	@Then("a new page loads which contains a contact form")
	public void a_new_page_loads_which_contains_a_contact_form() throws InterruptedException {
		Thread.sleep(2000);
		contactPage = new ContactPage(driver);
		String contactPageTitle = driver.getTitle();
		System.out.println("contactPageTitle : "+contactPageTitle);
		Thread.sleep(2000);
		Assert.assertEquals("Contact Us | Irish Life", contactPageTitle);
		System.out.println("User is on Contact Page");
		Thread.sleep(2000);
		Assert.assertTrue(contactPage.verifyGetFinancialAdvicetext());
		Thread.sleep(2000);
		Assert.assertTrue(contactPage.verifyBookConsultationBtn());
		System.out.println("Contact form is displayed in Contact Page");
		driver.quit();
	}

	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String navigationLink) {
		homePage.clickOnLink(navigationLink);
		System.out.println("User clicked on "+navigationLink);
	}

	@Then("user should see a form which contains the text {string}")
	public void user_should_see_a_form_which_contains_the_text(String text) throws InterruptedException {
		Thread.sleep(2000);
		homePage.acceptCookieOption();
		irishLifeHealthPage = new IrishLifeHealthPage(driver);
		Thread.sleep(2000);
		String irishLifeHealthPageTitle = driver.getTitle();
		//System.out.println("irishLifeHealthPageTitle : "+irishLifeHealthPageTitle);
		Assert.assertEquals("Health Insurance Ireland - Compare Quotes - Irish Life Health", irishLifeHealthPageTitle);
		System.out.println("User is on Irish Life Health Page");
		Thread.sleep(2000);
		irishLifeHealthPage.verifyText(text);
		System.out.println("User can see the form which contains "+text);
		driver.quit();
	}

}
