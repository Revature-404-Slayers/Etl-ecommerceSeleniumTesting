Feature: Dashboard works

  Scenario: Dashboard works
    Given The User is on the Dashboard page
    When The User clicks View Details for Marketing Team
    Then The User see Marketing details

    When The User clicks View Detail for Research Team
    Then The User see Research details

    When The User clicks View Details for Management Team
    Then The User see Management details

    When The User clicks View Details for Data Resources
    Then The User see Data details