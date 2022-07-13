Feature: Admin logout

  Scenario: Admin logs out
    Given Admin already log in
    When he "ali" select to log out
    Then log out done