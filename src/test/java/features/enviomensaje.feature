Feature: Envio de mensaje a cliente en tienda nube
  Como usuario de tienda nube, quiero enviar un mensaje a un cliente

  Scenario: Enviar mensaje a Cliente
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contrasena correcta
    And Presiono el boton Ingreso a mi Tienda
    When Presiono boton de ventas
    And ingreso un nombre a buscar
    And Presiono Enter
    And Selecciono numero de compra y presiono enter
    And Aparecen los datos del usuario
    And elijo su correo
    Then Se visualiza la vista de mensajes