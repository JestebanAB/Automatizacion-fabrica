

Feature: Eliminar mi perfil del sistema
  como usuario registrado del sistema
  necesito eliminar mi perfil de usuario
  para dejar de formar parte de la plataforma

  Scenario: Eliminar perfil con confirmación válida
    Given que estoy autenticado en el sistema
    When solicito la eliminación de mi perfil y confirmo la acción
    Then el sistema elimina mi perfil y me muestra un mensaje de confirmación