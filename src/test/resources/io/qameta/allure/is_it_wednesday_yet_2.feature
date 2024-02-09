Feature: Is it ploskiy json?
  Everybody wants to know where we can find ploskiy json

  Scenario: There is a problem
    Given There is a question
    When I need to add ploskiy JSON
      | string1 | value1  |
      | string2 | value2  |
      | string3 | value3  |
      | string4 | value4  |

    Then I should be told "Ha-ha"
