@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "sedan" from uber application
    When User select car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

    @Regression
  Scenario: Booking Cab SUV
    Given User wants to select a car type "suv" from uber application
    When User select car "sedan" and pick up point "Bangalore" and drop location "Hyerabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

      @Prod
  Scenario: Booking Cab for Mini
    Given User wants to select a car type "mini" from uber application
    When User select car "sedan" and pick up point "Pune" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
