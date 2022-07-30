Feature: Borrow book 

Scenario: Borrow a book when the user is logged in and enter a valid title
	Given user logged in
	When user "user" select to borrow book
	And user must enter the "title"
	Then book was borrowed from the library if it available
	And the book is not in library now

Scenario: user is logged in and click on borrow book 
    Given user logged in
    When user "user" select to borrow book
    And user have 5 book from library
    Then user con not borrow another books
	
	
 Scenario: Borrow a book when the user is not logged in 
    Given user not logged in
    When user with select to borrow book
    Then user could not borrow book