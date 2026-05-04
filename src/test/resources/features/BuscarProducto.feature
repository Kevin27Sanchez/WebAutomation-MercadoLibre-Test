Feature: Buscar producto

  @Regression
  Scenario: Buscar un producto específico exitosamente
    Given estoy en la página principal de Mercado Libre
    When busco el producto "Laptop"
    And doy click en el botón de búsqueda
    Then debería visualizar resultados relacionados con "Laptop"