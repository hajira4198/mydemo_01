Feature: My Standard Chartred bank acccount

Background: Launching of the bank landing page
Given Hajira has done with the browser configuration
Then She launches the application in her favourite chrome browser

Scenario: Sign in for hajira

Given She clicks on sign in link
Then She enters the valid creds
And he clicks on submit button


Scenario: Sign up for the guest user
Given Guest user clicks on sign up link
When she provide all the mandatory data
Then she clicks on sbmt and id  generated

Scenario: Hajira wanted to reset her password
Given She clicks on forgot password link
Then She enters the mobile number
And She recives otp and the same he provides
Then She is able to reset her Password
