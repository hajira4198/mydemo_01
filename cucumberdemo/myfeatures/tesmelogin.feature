Feature: Test Me parameterization

  Scenario Outline: Test Me login for multiple users
    Given I am launching the test me apllication in chrome
    And I click on SignIn link
    When I provide "<uname>"
    And I provide password "<pass>"
    Then I click on login and verify the login status

    Examples: 
      | uname  | pass   |
      | asdfgh | asdfgh |
      | zxcvbn | zxcvbn |
      | qwerty | qwerty |
      | poiuyt | poiuyt |
