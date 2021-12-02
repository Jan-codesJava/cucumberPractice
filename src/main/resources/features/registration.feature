Feature:

  Scenario: User registration with different data
    Given User is on registration page
    When User enters following user details
      | jan | automation | jan@gmail.com  | 9999  | NY  |
      | tom | damir      | lisa@gmail.com | 86575 | SFO |
      | eve | doranh     | eve@gmail.com  | 8765  | TX  |
    Then user registration should be successful
