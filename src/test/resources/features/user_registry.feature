

Feature: Registrar un nuevo usuario en el sistema
  como nuevo usuario del sistema necesito crear una cuenta
  con mis datos personales para poder acceder y utilizar las funcionalidades del sistema

  Scenario: Registrar un usuario con datos válidos
    Given que estoy en la página de registro del sistema
    When ingreso todos los datos requeridos correctamente
    Then el sistema crea la cuenta y muestra un mensaje de confirmación