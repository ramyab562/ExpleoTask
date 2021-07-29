Feature: Expleo Test Task

Scenario: Click the edit link
	Given user is on the demo page
	When user sees the "edit" link on the page in the table
	Then user should be able to click on the "edit" link on row "1"
	Then close the browser