Feature: Home Page
  In order to check my order details
  As a registered user
  I want to specify the features of order details page

  Background:
    Given a registered user exits
    Given user is on Amazon login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user navigates to order page


  Scenario: Check previous Order Details
    Then user navigates on order link
    Then user checks the previous order details

  Scenario: Check Open Order Details
    Then user navigates on open order link
    Then user checks the open order details


  Scenario: Check Cancelled Order Details
    Then user navigates on cancelled order link
    Then user checks the cancelled order details
