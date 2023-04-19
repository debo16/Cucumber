Feature: testing login functionality of Guru99
1)valid case
2)invalid case
Background: browser should open and navigate to log in page
@PositiveTesting
Scenario: testing Guru99 login with valid data
Given open browser and navigate to log in page
When enter username "user"
And enter password "user"
And hit on submit
Then Shoud see the login page of Guru99 and get title as Welcome: Mercury Tours
@NegativeTesting
Scenario: testing Guru99 login with invalid data
Given open browser and navigate to log in page
When enter username "USER"
And enter password "USER23"
And hit on submit
Then Shoud see the login page and title as Welcome: Mercury Tours 