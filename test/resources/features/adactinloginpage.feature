Feature:Validate Adaction Login Page

Scenario Outline: To verify Valid Username and Pass word

Given to Launc Adactin Hotel  page

When User enter valid  "<username>" User name in text box 

And User enter valid password "<password>" password in text box

And User Click login button

And User Select the Hotels
And user Confirm theHotel
And  User enter the firstname,lname,add,ccardNo,CVV "<firstName>","<lName>","<add>","<ccardNo>","<cvv>" user in text box
And User click book now btn
Then User Capture the OrderNo




Examples:
|username|password|firstName|lName|add|ccardNo|cvv|
|Selvakarthick|EINK8E|Arun|Jay|Chennai|1234567891234567|455|



