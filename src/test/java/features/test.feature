Feature: Ingreso y navegación dentro de tienda nube
  Como usuario de tienda nube, quiero ingresar ingresar al login
  con un usuario incorrecto y otro correcto, salir, entrar y navegar dentro del sitio.

  Scenario: Ingresar con un usuario o clave incorrecto

    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contraseña erronea
    When Presiono el botón Ingreso a mi Tienda
    Then Saldra un mensaje Tu email o contraseña son incorrectos. Revisalos y volvé a intentar

  Scenario: Ingresar con un usuario o clave correcto
    Given Cuando ingreso a tienda nube
    And Presiono Login
    And Ingreso mi Mail
    And Ingreso mi contraseña correcta
    When Presiono el botón Ingreso a mi Tienda
    Then Saldra un mensaje Inicio


