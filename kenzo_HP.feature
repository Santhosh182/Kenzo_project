#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Checking the Functionality of Landing and HomePage


  Scenario: validating with invalid details.
    Given User login with URL
    And User Accepting the cookies link
    When User navigating to international page link
    And User landed on hompepage and navigate to usericon
    And user entered UserID <abc@gmail.com> in the email_id field
    Then user clicked on continue button
    And user entered password <abc@gmail.com> in the password field
    And user submitted to login
    Then user validating the warning caption
    
    
  
  Scenario Outline: validating with multiple invalid details.
    Given User login with URL
    When User navigating to international page link
    And User landed on hompepage and navigate to usericon
    And user entered UserId <UserId> in the email_id field
    Then user clicked on continue button
    And user entered password <password> in the password field
    And user submitted to login
    Then user validating the warning caption
Examples:
|UserId					|password	|
|abc@gmail.com	|abc1234	|
|bcd@gmail.com	|bcd1234	|
|efg@gmail.com	|efg1234	|




  