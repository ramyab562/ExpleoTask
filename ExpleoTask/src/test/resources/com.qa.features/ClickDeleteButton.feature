Feature: Expleo Test Task

Scenario: Click the delete link
	Given user is on the demo page
	When user sees the "delete" link on the page in the table
	Then user should be able to click on the "delete" link on row "1"
	Then close the browser