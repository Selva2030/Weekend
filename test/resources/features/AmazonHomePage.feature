 Feature: Validating the product search page
 Scenario Outline: To search Product in the textbox
 Given User launch the Amazon Page
 When user enter the product name "<productname>" in textbox
 And user click searchbutton
 And user select the product
 And user click addCart button
 And user click Proceeded button
 And User enter valid user name "<username>" in textbox
 And User enter valid password "<password>" in textbox
 
 
 
 Examples:
 |productname|username|password|
 |samsungfoldable|9751076979|Arunjay|
 
  
 