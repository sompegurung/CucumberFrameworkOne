Feature: Create FB Account
#Background: Use Background for common features

Scenario: Validate entry of email and Password
Given User need to be on Facebook login page
When User enters the following data
	|username| password|
	|Hero	 | lahure|
Then close browser
