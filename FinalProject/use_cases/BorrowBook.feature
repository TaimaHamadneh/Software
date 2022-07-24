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
	
Scenario: User cannot borrow books if he has late books 
	Given a book with code "xyz" is in the library 
	And a book with code "Beck99" is in the library 
	And a user is registered with the library 
	When the user borrows the book with code "Beck99" 
	And 21 days have passed 
	And the user borrows the book with code "xyz" 
	Then the book with code "xyz" is not borrowed by the user 
	And the error message "You can't borrow any new book because you have an overdue books" 
	
Scenario: User cannot borrow books if he has fines 
	Given a book with code "Beck99" is in the library 
	And a book with code "xyz" is in the library 
	And a user is registered with the library 
	When the user borrows the book with code "Beck99" 
	And 21 days have passed 
	Then the user has to pay a fine of 30 NIS 
	When the user returns the book with code "Beck99" 
	Then the user has to pay a fine of  30 NIS 
	When the user borrows the book with code "xyz" 
	Then the book with code "xyz" is not borroweed by the user 
	And the error message "Can't borrow book , you have fines" is given 
	
Scenario: Borrow a book when the user is not logged in 
	Given user not logged in 
	When user with select to borrow book 
	Then user could not borrow book