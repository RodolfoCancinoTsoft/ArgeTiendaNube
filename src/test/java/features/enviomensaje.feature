Feature: Envio de mensaje a cliente en tienda nube
  Como usuario de tienda nube, quiero enviar un mensaje a un cliente

  Scenario: Enviar mensaje a Cliente
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contraseña correcta
    And Presiono el botón Ingreso a mi Tienda
    And Presiono boton de ventas
    And Ingreso a buscar e ingreso un nombre
    And Presiono Enter
    And Selecciono numero de compra y presiono enter
    And Aparecen los datos del usuario
    When elijo su correo
    Then Se visualiza la vista de mensajes