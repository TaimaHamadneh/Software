Feature: Add book
  
  Adds a book to the library, so that it can be searched and borrowed. Only the 
    administrator can do this. Thus, the administrator has to be logged in. 

  Scenario: Add a book when the Admin is logged in and enter a valid isbn
    Given Admin loged in
    When Admin "ali" select to add book
    And Admin must enter the "Test-Drivenest Driven Development","Kent Beck","Beck2002"
    And valid isbn "0140449116"
    Then book was added to the library

  Scenario: Add a book when the Admin is logged in and enter a unvalid isbn
    Given Admin loged in
    When Admin "ali" select to add book
    And Admin must enter the "Test-Drivenest Driven Development","Kent Beck","Beck2002"
    And unvalid isbn "0140449117"
    Then The book has not been added

  Scenario: Add a book when the Admin is not logged in 
    Given Admin not loged in
    When Admin with select to add book
    Then Admin could not add book