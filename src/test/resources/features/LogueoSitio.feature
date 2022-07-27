Feature: LogueoSitio

  Scenario Outline: Ingresar al sitio
    Given Ingresa a la url '<url>'
    And ingresamos el '<usuario>' y '<pass>'
    When hace clic
    Then ve el mensaje '<mensaje>'
    #Test
    Examples:
      | url                                  | usuario                     | pass     | mensaje |
      | https://gymanager-dev.herokuapp.com/ | stanleycopeland@xinware.com | 62346460 | Logeado |


