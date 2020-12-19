Feature: Create FB Account
#Background: As a user, create an account

Scenario: Validate Entry of email field 
Given User need to be on Facebook login page
When User enters user "Hero" first name
Then User checks user "Hero" first name is present
Then close browser

Scenario: Validate entry of email and Password
Given User need to be on Facebook login page
When User enters user "Hero" first name
And User enters password "lahure" in email
Then User clicks on Login button
Then close browser
