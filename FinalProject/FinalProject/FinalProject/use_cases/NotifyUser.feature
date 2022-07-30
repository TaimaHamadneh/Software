Feature: Notify User
Scenario: Send reminder email
Given that the admin is logged in
And there is a user with atleast one late book
When the admin sends a reminder email
Then then the user should receive an email with subject "late book(s)" and body "you have n late book(s)"

Scenario: Unregister a user
Given a user is registered with the Elibrary 
And that the admin is logged in 
When the admin is logged in
Then the user is out of library