Feature: Buscar cliente en tienda nube
  Como usuario de tienda nube, quiero encontar a un cliente por su nombre

  Scenario: Buscar Cliente
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contraseña correcta
    And Presiono el botón Ingreso a mi Tienda
    And Presiono boton de ventas
    When ingreso un nombre a buscar
    And Presiono Enter
    Then Saldran datos del cliente que se busco