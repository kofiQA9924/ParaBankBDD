@Login
Feature: Customer Login Page
  Scenario: Login with Valid credentials
    Given launches browser and opens ParaBank
    And   enter Username
    And   enters Password
    Then  User clicks on login Button
    Then  User verify's accounts overview
    Then  User log's out