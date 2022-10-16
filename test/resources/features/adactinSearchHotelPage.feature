Feature: Validating  The Search Hotel Login Page
Scenario: User Verify the Valid inputs to all fields

Given Launch Adactin hoel WebPage and give user name and password then click login button 

When User select  Location "<location>" select location in dropdown box
And  User select  Hotel "<hotel>" select Hotel in dropdown box
And User select  roomtype "<roomtype>" select roomtype in dropdown box
And user select no.of.rooms "<rooms >"select no.of.rooms in dropdown box
And user select no.of.adaults "<adaults >"select no.of.adaults  in dropdown box
And user select no.of.children"<children>" select no.of.children  in dropdown box
And User click search button


