Feature: Ingresar al sistema de Saucedemo
  Scenario Outline: Login
    Given Nttdata ingresa a la pagina de saucedemo
    When Nttdata ingresa el usuario <usuario> y la clave <clave>
    And Nttdata da click en ingresar
    Then NTTdata ingresa al portal del listado de productos
    Examples:
      | usuario | clave |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
