Feature: Buscar cliente en tienda nube
  Como usuario de tienda nube, quiero encontar a un cliente por su nombre

  Scenario: Buscar Cliente
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contrasena correcta
    And Presiono el boton Ingreso a mi Tienda
    When Presiono boton de ventas
    And ingreso un nombre a buscar
    And Presiono Enter
    Then Saldran datos del cliente que se busco