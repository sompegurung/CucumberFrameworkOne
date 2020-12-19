Feature: Create FB Account using multiple accounts 

Scenario Outline: Validate entry of email and Password
Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters password "<password>" in email
#Then User clicks on Login button
Then close browser
Examples:
	|	user	|	password	|
	|	Tom		|	Jerry		|
	|	Harry	|	Rock		|
