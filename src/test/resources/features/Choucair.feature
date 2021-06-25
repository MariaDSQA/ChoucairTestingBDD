@choucair
Feature: login en el aplicativo Choucair
  Como usuario de Choucair
  quiero iniciar sesion
  para realizar operaciones en Choucair.

  @casoExitoso
  Scenario: Iniciar sesión con credenciales correctos.
    Given El usuario abre la aplicacion Choucair
    When El usuario ingresa su correo electronico "maria.ds.2306@gmail.com" en el campo correo
    And EL usuario ingresa su password "maria.ds.2306" en el campo password
    And El usuario presionar click en el login button Choucair
    Then puede ver home del aplicativo Choucair

  @casoErroneo
  Scenario: Iniciar sesión con credenciales incorrectos.
    Given El usuario abre la aplicacion Choucair
    When El usuario ingresa su correo electronico "mariads2306@gmail.com" en el campo correo
    Then Valida mensaje de error