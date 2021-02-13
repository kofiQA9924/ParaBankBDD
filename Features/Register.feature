@Register
Feature: Register New User
  Scenario: Create new user with Valid Credentials
    Given User launches browser and opens ParaBank
    And User clicks on Register Button
    Then User enters FirstName
    And User enters LastName
    And User enters Address
    And User enters City
    And User enters State
    And User enters ZipCode
    And User enters PhoneNumber
    And User enters SSN
    And User enters Username
    And User enters Password
    When User confirms Password
    Then User clicks register Button