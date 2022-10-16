 Feature: Verifying the Amazon Web Page

Background: User lanch the Amazon Webpage


 Scenario : Validate Mobile tab in Amazon Web Page
 Given User launch Amazon Webpage
 When  User Click the Mobiles
 
 Scenario Outline: Entering the Product Name 
 When User Enter the Product Name "<produceName>" in text box
 When User Click search button
 
 
 Examples:
 
 |produceName|
 |iphone13+|