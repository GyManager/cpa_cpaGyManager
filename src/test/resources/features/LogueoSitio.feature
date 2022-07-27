Feature: LogueoSitio

  Scenario Outline: Validamos el login de la Home
    Given Ingresa a la url '<url>'
    And ingresamos el '<usuario>' y '<pass>'
    When hace clic
    Then ve el mensaje '<mensaje>'
    #Test
    Examples:
      | url                                   | usuario                     | pass     | mensaje |
      | https://gymanager-test.herokuapp.com/ | stanleycopeland@xinware.com | 62346460 | Logeado |


