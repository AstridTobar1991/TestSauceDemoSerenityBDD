# new feature
# Tags: optional

Feature: Realizar compras de productos

  Scenario Outline: NttData requiere seleccionar dos productos al carrito y finalizar la compra
    Given NttData se encuentra dentro del sistema con el usuario <usuario> y clave <clave>
      When NttData agrega dos productos del listado de productos al carrito de compras
      And NttData visualiza los productos seleccionados en el carrito de compra
      And NttData ingresa al formulario de compra
      And NttData ingresa los datos para nomber: <nombre> apellido: <apellido> zip: <zip>
      And NttData va a la pagina del resumen de la compra
      And NttData finaliza la compra
      Then NttData tiene la confirmacion por pantalla
    Examples:
      | usuario | clave | nombre | apellido | zip |
      | standard_user | secret_sauce | Astrid | Tobar | 1234 |
      | locked_out_user | secret_sauce | Can | Benji | 431 |
      | performance_glitch_user | secret_sauce | Cat | Catalina | 4566 |

