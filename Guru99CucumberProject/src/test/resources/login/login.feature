Feature: test Guru99 
1)valid
2)invalid
Background:
Given open browser and navigate to log in page
@PositiveTesting
Scenario: Testing Guru99 functionality with valid data
And Enter username "user"
And Enter password "user"
And Click submit
Then I should get Log in page
@Negative Testing
Scenario: Testing Guru99 functionality with valid data
And Enter username "apple"
And Enter password "apple"
And Click submit
Then I should get Log in page