Feature: Parameters?
  Everybody wants to know how to add parameters

  @allure.id=282733
  Scenario Outline: print string <str>
    When print string "<str>"
    Examples:
      | str    |
      | allure |
      | test   |