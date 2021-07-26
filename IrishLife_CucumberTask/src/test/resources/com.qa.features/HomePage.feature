Feature: Irish Life Application QA Task

Scenario: HomePage Contact link
	Given user is on the Irish Life website homepage
	When user clicks on the "Contact" link in the top navigation
	Then a new page loads which contains a contact form

Scenario: Find out more link
	Given user is on the Irish Life website homepage
	When user clicks on the "Find out more" link
	Then user should see a form which contains the text "I want to cover"