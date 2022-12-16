Feature: Is it Wednesday yet?
  Everybody wants to know when it's Friday

  @allure.id:10
  Scenario: Wednesday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
