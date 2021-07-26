$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com.qa.features/HomePage.feature");
formatter.feature({
  "name": "Irish Life Application QA Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HomePage Contact link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the Irish Life website homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_is_on_the_Irish_Life_website_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the \"Contact\" link in the top navigation",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_clicks_on_the_link_in_the_top_navigation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a new page loads which contains a contact form",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.a_new_page_loads_which_contains_a_contact_form()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Find out more link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on the Irish Life website homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_is_on_the_Irish_Life_website_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the \"Find out more\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_clicks_on_the_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see a form which contains the text \"I want to cover\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_should_see_a_form_which_contains_the_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});