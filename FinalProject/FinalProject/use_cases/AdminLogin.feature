Feature: Admin login

  Scenario Outline: Admin log in with valid credentials 
    Given Admin selected to log in
    When Admin entered the valid <username> and the valid <password>
    Then log in must be successful

    Examples: 
      | username | password |
      | "ali"    | "12345"  |
      | "aya"    | "54321"  |
      | "noor"   | "6789"   |

  Scenario Outline: Admin has the wrong password 
    Given Admin selected to log in
    When Admin entered the valid <username> and the unvalid <password>
    Then log in must be field

    Examples: 
      | username | password |
      | "ali"    | "00000"  |
      | "aya"    | "11111"  |
      | "noor"   | "22222"  |
