Feature: reportIssue

  Scenario: cadastrar um report issue
    Given eu estou logada
    When eu clico em report issue
    And escolho um projeto
    And preencho os dados da issue
    Then clico em submit
    And fecho o navegador

  Scenario: cadastro sem categoria
    Given eu estou logada
    When eu clico em report issue
    And escolho um projeto
    And não preencho a categoria
    Then gera um erro de criação da issue
    And fecho o navegador

  Scenario: cadastro sem sumario
    Given eu estou logada
    When eu clico em report issue
    And escolho um projeto
    And não preencho o sumario
    Then gera um erro de criação da issue
    And fecho o navegador

  Scenario: cadastro sem descrição
    Given eu estou logada
    When eu clico em report issue
    And escolho um projeto
    And não preencho a descrição
    Then gera um erro de criação da issue
    And fecho o navegador