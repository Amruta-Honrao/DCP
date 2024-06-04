Feature: To verify the successful login

  Scenario: check the login
    Given I launch the url
    When I enter the "51555407" and "Webuser123"
    Then I click Login
    Then I verify the successful login happeped
