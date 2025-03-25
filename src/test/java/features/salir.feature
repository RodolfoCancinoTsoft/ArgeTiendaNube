Feature: Logout tienda nube
  Como usuario de tienda nube, quiero cerrar sesion

  Scenario: Cierre Sesion
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contrasena correcta
    And Presiono el boton Ingreso a mi Tienda
    And Presiono PokeStop
    When Cierro sesion
    Then Visualizo el login de tienda nube