Feature: test orangehrm #goal
1)valid
2)invalid
Background: 
Given open browser & navigate to login page
@PositiveTesting
Scenario: testing orangehrm fuctionality with valid data  
When Enter username "Admin"
And Enter password "admin123"
And Click on login
Then we should redirect in homepage of ornageHRM
@NegativeTesting
Scenario: testing orangehrm fuctionality with invalid data  
When Enter username "admin"
And Enter password "admi"
And Click on login
Then we should redirect in homepage of ornageHRM