Feature:Does login work

  Scenario: Does the login work
    Given  The User on the login page
    When  The User fills in the username box and enters
    When  The User fills in the password box and enters
    When  The User clicks login
    Then  The User should be on the Dashboard
