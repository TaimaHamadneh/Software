Feature: search book 


Scenario: search by a title 
	Given i choose to search by title 
	When i entered a valid substring "markiting" 
	Then the book for this title will shown 
	
	
Scenario: search by a author 
	Given i choose to search by author 
	When i entered a valid substring "tolkie" 
	Then  the book for this auther will shown 
	
	
Scenario: search by a ISBN 
	Given i choose to search by ISBN 
	When i entered a valid substring "093638540" 
	Then  the book for this isbn will shown 
	
Scenario: search by title when the user is logged in 
	Given Admin already log in 
	And i choose to search by title 
	When i entered a valid substring "markiting" 
	Then  the book for this title will shown  
	
Scenario: search by outher when the user is logged in 
	Given Admin already log in 
	And i choose to search by author 
	When i entered a valid substring "tolkien" 
	Then the book for this auther will shown 
	
	
Scenario: search by ISBN when the user is logged in 
	Given Admin already log in 
	And i choose to search by ISBN 
	When i entered a valid substring "0936385405" 
	Then the book for this isbn will shown  
	
Scenario: search by a title when No books match the criteria 
	Given i choose to search by title 
	When i entered  invalid substring "lostt" 
	Then no information will apear 
	
	
Scenario: search by a author when No books match the criteria 
	Given i choose to search by author 
	When i entered  invalid substring "tolkiennn" 
	Then no information will apear 
	
	
Scenario: search by a ISBN when No books match the criteria 
	Given i choose to search by ISBN 
	When i entered  invalid substring "09363854053" 
	Then no information will apear 


Scenario: search by a title when there is more than one book
	Given i choose to search by title 
	When i entered a valid substring "lost" 
	Then all book for this title will shown 
	
	
Scenario: search by a author when there is more than one book 
	Given i choose to search by author 
	When i entered a valid substring "tolkie" 
	Then  all book for this auther will shown 
	