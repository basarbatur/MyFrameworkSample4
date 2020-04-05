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
@sprint1
Feature: Login

  @smoke @login @regression
  Scenario: Valid Login
    Given I see company logo on login page
    When I enter valid username and password
    And I click login button
    Then I successfully logged in

  @login @negative
  Scenario: Invalid Login
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed

  @negative
  Scenario: Error message validation
    When I enter invalid username and password I see errorMessage
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Admin1   | Syntax123! | errorMessage        |
