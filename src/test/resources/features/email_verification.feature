

Feature: Verificar mi correo electrónico en el sistema
  como nuevo usuario del sistema
  necesito verificar mi dirección de correo electrónico
  para activar mi cuenta y poder acceder al sistema

  Scenario: Verificar correo electrónico con un token válido
    Given que he recibido un correo de verificación en mi bandeja de entrada
    When hago clic en el enlace de verificación con un token válido
    Then el sistema confirma la verificación y activa mi cuenta
