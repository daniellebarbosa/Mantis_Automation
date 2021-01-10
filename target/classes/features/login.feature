Feature: login

  Scenario: login
    Given eu estou na página de login
    When eu digito meus dados
    And clico no botão de login
    Then I logged
    And fecho o navegador

  Scenario: logout
    Given eu estou na página de login
    When eu digito meus dados
    And clico no botão de login
    And I logged
    Then eu deslogo
    And fecho o navegador

    Scenario: esqueciSenha
      Given eu estou na página de login
      When eu clico em Lost your Password
      Then eu estou na página de esqueci senha
      And fecho o navegador