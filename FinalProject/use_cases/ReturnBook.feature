Feature: return Book 


Scenario: Return a book when the user is logged in and enter a valid title
 	Given user is logged in 
 	When user "user" select to return a book
 	And user must enter the "title"
 	Then the book is returned to the library
 	And the book is available in the library now
 	
Scenario: user is logged in and click on return book
	Given user logged in
 	When user "user" select to return a book
 	And the book with "title" is not Borrowed 
	Then the user could not return the book
	
Scenario: Add a book when the user is not logged in
	Given user not logged in
	When user with select to return a book
	Then user could not return book
	
	
