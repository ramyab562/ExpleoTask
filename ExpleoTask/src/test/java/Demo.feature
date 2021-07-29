Feature: Expleo Test Task

Scenario: Demo Page text verification
	Given user is on the demo page
	Then get the title of the page
	And user should see the text 'Challenging DOM'
	Then close the browser

Scenario: Click the first button
	Given user is on the demo page
	When user sees the three buttons on the page
	Then user should be able to click on the First button
	Then close the browser
	
Scenario: Click the second button
	Given user is on the demo page
	When user sees the three buttons on the page
	Then user should be able to click on the Second button
	Then close the browser

Scenario: Click the third button
	Given user is on the demo page
	When user sees the three buttons on the page
	Then user should be able to click on the Third button
	Then close the browser
	
Scenario: Click the edit link
	Given user is on the demo page
	When user sees the "edit" link on the page in the table
	Then user should be able to click on the "edit" link on row "1"
	Then close the browser
	
Scenario: Click the delete link
	Given user is on the demo page
	When user sees the "delete" link on the page in the table
	Then user should be able to click on the "delete" link on row "1"
	Then close the browser
	
Scenario: Get cell value
	Given user is on the demo page
	Then user should get the cell value from the row number "5" and column number "6"
	Then close the browser

Scenario: Get number of rows in the table
	Given user is on the demo page
	Then user should get the number of rows in the table
	Then close the browser

Scenario: Get number of columns in the table
	Given user is on the demo page
	Then user should get the number of columns in the table
	Then close the browser

Scenario: Get text in the page footer
	Given user is on the demo page
	Then user should get the page footer text
	Then close the browser
	
#Scenario: Click link on page footer 
#	Given user is on the demo page
#	When user clicks the link on the page footer
#	Then user gets Title of new Page
#	Then close the browser
