Feature: The Resgister work

  Scenario: The Register work
    Given The User on the Register page
    When The User fills out First Name Box
    When The User fills out Last Name Box
    When The User fills out Username Box
    When The User fills out Password box
    When The User fills out Confirm Password Box
    Then The User is added