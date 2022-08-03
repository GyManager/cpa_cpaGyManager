Feature: LoginSite

  Scenario Outline: Validar sistema de login del sitio
    Given Ingresa a la url '<url>' home
    And ingresamos el correo '<usuario>' y  contrasena '<pass>'
    When hacemos enter en el campo pass
    Then verificar que ingresa al sitio '<url>' y visualiza el mensaje '<mensaje>'

    #Test
    @Regrecion
    Examples:
      | url                                   | usuario                     | pass     | mensaje |
      | https://gymanager-test.herokuapp.com/ | stanleycopeland@xinware.com | 62346460 | Logeado |


  Scenario Outline: Validar sistema de login del sitio
    Given Ingresa a la url '<url>' home
    When hacemos enter en el campo pass
    #Then verificar que ingresa al sitio '<url>' y visualiza el mensaje '<mensaje>'
    And visualiza la tabla de clientes

    #Test
    @TestTabla
    Examples:
      | url                                          | usuario                     | pass     | mensaje |
      | https://gymanager-dev.herokuapp.com/ | stanleycopeland@xinware.com | 62346460 | Logeado |
