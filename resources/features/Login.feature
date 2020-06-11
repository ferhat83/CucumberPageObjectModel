Feature: Walmart login feature 

Scenario Outline: Negative login test with invalid email format and invalid password
	Given user navigates to walmart application 
	When page title is "Walmart.com | Save Money. Live Better." 
	Then user clicks on account 
	Then user clicks on sign in 
	Then user is landed to login page "Login" 
	Then user enters username "<username>" 
	Then user enters password "<password>" 
	Then user clicks on login btn
	Then user should see "<message1>" in username field 
	And use should see "<message2>" in password field 
	
	Examples: 
		|username|password|message1                           |message2             |
		|        |        |Email address is required.         |Password is required.|
#		|xxxxx   |        |Please enter a valid email address.|Password is required.|
#		|        |xxxxxxxx|Email address is required.         |                     |
#		|xxxxx   |xxxxxxxx|Please enter a valid email address.|                     |
		
		
  