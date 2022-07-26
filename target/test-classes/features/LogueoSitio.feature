Feature: LogueoSitio

  Scenario Outline: Ingresar al sitio
    Given Ingresa a la url '<url>'
    When hace clic
    Then ve el mensaje '<mensaje>'
    #
    Examples:
      | url         | mensaje |
      | www.gym.com | Hola    |
