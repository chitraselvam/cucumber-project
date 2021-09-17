Feature: validating  functionality of Adactin hotel website.

Scenario: validating login  functionality with valid user name and invalid password.
Given user is on adactin website.
When user should enter user name and password
And user should click login button 
When user should select the location,hotel,room type,no of rooms,check in date , checkout date,adults per room and children per room
And user should click search button
When user should select hotel 
Then user should  click continue button
When user enters firstname,lastname,billing address,cardtype,cardno,expiry date,cvv no
And user should click book now button
Then order no should be generated