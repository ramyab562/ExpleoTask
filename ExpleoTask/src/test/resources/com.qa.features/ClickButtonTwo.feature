Feature: Expleo Test Task

Scenario: Click the second button
	Given user is on the demo page
	When user sees the three buttons on the page
	Then user should be able to click on the Second button
	Then close the browser