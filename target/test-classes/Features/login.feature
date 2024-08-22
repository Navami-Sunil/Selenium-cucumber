@SmokeFeature
Feature: feature to test gmail funtionality
@smoketest
Scenario: Check login is successful with valid credentials

Given user is on the login page
When user enters <mail> and <password>
And compose a mail
Then the mail is sent

Examples:
| mail  | password | 
| u2003144@rajagiri.edu.in |     navamisunil | 
