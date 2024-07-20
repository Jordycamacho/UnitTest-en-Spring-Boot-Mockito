# UnitTest-en-Spring-Boot-con-JUnit-y-Mockito

## Descripción

Este proyecto demuestra cómo realizar pruebas unitarias en aplicaciones Spring Boot utilizando JUnit y Mockito. Las pruebas unitarias son esenciales para garantizar la calidad del software y prevenir la introducción de errores en el código a medida que evoluciona.

### Tecnologías utilizadas

- **Spring Boot**: Un framework para construir aplicaciones basadas en Spring de manera rápida y con menos configuración.
- **JUnit 5**: La versión más reciente de JUnit, un framework de pruebas unitarias para Java.
- **Mockito**: Un popular framework de mocking para Java, que permite crear objetos simulados para las pruebas.
- **JaCoCo**: Una herramienta de cobertura de código para Java que ayuda a medir cuántas líneas de código son ejecutadas durante las pruebas.

### Estructura del Proyecto

- **`controller`**: Controladores REST que manejan las solicitudes HTTP.
- **`models`**: Clases de modelo que representan los datos de la aplicación.
- **`repositories`**: Interfaces que definen métodos para interactuar con la base de datos.
- **`util`**: Clases utilitarias que proporcionan funcionalidades adicionales.
- **`test`**: Clases de prueba que verifican el comportamiento del código de la aplicación.

### Ejecución de Pruebas y Generación de Reportes

El proyecto está configurado para ejecutar pruebas unitarias y generar reportes de cobertura de código utilizando JaCoCo. Para ejecutar todas las pruebas y generar el reporte, sigue estos pasos:

1. **Clonar el repositorio**:
   git clone https://github.com/tu-usuario/UnitTest-en-Spring-Boot-con-JUnit-y-Mockito.git
   cd UnitTest-en-Spring-Boot-con-JUnit-y-Mockito

2. **Ejecutar las pruebas y generar el reporte de cobertura**:

    mvn clean test

3. **Ver el reporte de cobertura de código**:

    Después de ejecutar las pruebas, el reporte de cobertura de JaCoCo se genera en target/site/jacoco/index.html. Puedes abrir este archivo en tu navegador para ver un informe detallado de la cobertura de código.