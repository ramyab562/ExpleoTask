Feature: Expleo Test Task

Scenario: Demo Page text verification
	Given user is on the demo page
	Then get the title of the page
	And user should see the text 'Challenging DOM'
	Then close the browser