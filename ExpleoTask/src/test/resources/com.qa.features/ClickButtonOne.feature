Feature: Expleo Test Task

Scenario: Click the first button
	Given user is on the demo page
	When user sees the three buttons on the page
	Then user should be able to click on the First button
	Then close the browser