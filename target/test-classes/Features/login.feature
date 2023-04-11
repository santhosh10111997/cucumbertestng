

Feature: To validate the login functionality of facebook application

Background: 
Given The user shoud be in facebookpage page

Scenario Outline: Invalid login-To login with invalid details
When The use has enter the "<username>" and "<password>" 
And The user has click the "login" button
Then The user shoud be in invalid page

Examples:
|username|password|
|santhosh|101198|


 
 