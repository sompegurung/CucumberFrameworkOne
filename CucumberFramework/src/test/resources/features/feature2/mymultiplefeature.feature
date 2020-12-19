Feature: Create FB Account
#As a user, create an account

Scenario: Validate Entry of email field 
Given User need to be on Facebook login page
When User enters user first name
Then User checks users first name is present
Then close browser


Scenario: Validate entry of email and Password
Given User need to be on Facebook login page
When User enters user first name
And User enters password
Then User clicks on Login button
Then close browser
