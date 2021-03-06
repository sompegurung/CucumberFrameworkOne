Feature: Create FB Account using multiple accounts 

Scenario: Validate Entry of email field 
Given User need to be on Facebook login page
When User enters user "Hero" first name
Then User checks user "Hero" first name is present
#Then close browser

Scenario Outline: Validate entry of email and Password
Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters password "<password>" in email
#Then close browser
Examples:
	|	user	|	password	|
	|	Tom		|	Jerry		|
	|	Harry	|	Rock		|
