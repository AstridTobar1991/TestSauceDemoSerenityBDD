Feature: Ingresar al sistema de Saucedemo
  Scenario: Login
    Given Nttdata ingresa a la pagina de saucedemo
    When Nttdata ingresa el usuario standard_user y la clave secret_sauce
    And Nttdata da click en ingresar
    Then NTTdata ingresa al portal del listado de productos
