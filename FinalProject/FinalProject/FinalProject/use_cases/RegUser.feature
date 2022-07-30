Feature: Registration 


 Scenario Outline: Admin log in with valid credentials 
    Given Admin selected to Create "user"
    When Admin entered the valid "Name" and the valid "ID" and the valid "Email" and the valid "Address" and the valid "Postal code" and the valid "City"
    Then Create user must be successful
	
	Examples: 
		|Name   | Ahmed Ali| 
		|ID     | 123456 | 
		|Email  | ahm@gmail.com| 
		|Address       | Nablus Street| 
		|Postal code |H3H1T5| 
		|City   | Nablus| 
		
Scenario: exist account 
Given Admin is logged in
When Admin selected to create "user"
And user is already exist
Then Admin can not add this user

Scenario: Create a user account when the Admin is not logged in 
Given Admin is not logged in
When Admin selected to create user
Then Admin can not create user
