Feature: myview

  Scenario: ver um projeto criado por mim
    Given eu estou logada
    When eu seleciono o projeto
    And clico em Unassigned
    And clico em um projeto
    Then verifico se o projeto é meu
    And fecho o navegador

    Scenario: pesquisar um projeto
      Given eu estou logada
      When eu digito numero da issue
      And clico em Jump
      Then encontro o projeto
      And fecho o navegador
