Feature: To validating Fb New Account Creation Page
Scenario Outline: Entering New User Datails

Given User launch FB page
When User click new Account creation button 
When User enter "<fname>","<lname>","<email>","<cemail>","<pass>" inthe text box
And user select day , month and year in drop down
Then user click sign up button


 Examples:
|fname|lname|email|cemail|pass|
|selva|nayagi|nayagi@gmail.com|nayagi@gmail.com|1234|

