

Feature: Iniciar sesion en el sistema
    como usuario y registrado del sistema necesito ingresar mis credenciales de acceso
    para poder acceder a mi cuenta

  Scenario: Iniciar sesion con credenciales validas
    Given que estoy en la pagina de inicio de sesion del sistema
    When ingreso un usuario y contrasena validos
    Then accedo exitosamente al sistema y se muestra la pagina principal