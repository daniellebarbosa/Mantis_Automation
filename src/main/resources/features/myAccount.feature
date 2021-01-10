Feature: myaccount

  Scenario: navegar no my account
    Given eu estou logada
    When eu clico em My Account
    And eu clico em Preferences
    And eu clico em Manage Columns
    And eu clico em Profiles
    Then fecho o navegador
