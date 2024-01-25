# new feature
# Tags: optional

Feature: Realizar compras de productos

  Scenario: NttData requiere seleccionar dos productos al carrito y finalizar la compra
    Given NttData se encuentra dentro del sistema con el usuario standard_user y clave secret_sauce
      When NttData agrega dos productos del listado de productos al carrito de compras
      And NttData visualiza los productos seleccionados en el carrito de compra
      And NttData ingresa al formulario de compra
      And NttData ingresa los datos para nomber: Astrid apellido: Tobar zip: 1111
      And NttData va a la pagina del resumen de la compra
      And NttData finaliza la compra
      Then NttData tiene la confirmacion por pantalla

