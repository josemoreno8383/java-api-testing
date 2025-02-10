# Test automatizados para API pública de GoRest


Esta suite de pruebas está diseñada para probar el API pública de GoRest. 

## Características

Test implementados:
* Crear un usuario nuevo - Test: deberiaCrearUnNuevoUsuarioExitosamente
* Obtener lista de usuarios - Test: deberiaListarUsuariosExitosamente
* Obtener información de un usuario específico - Test: deberiaObtenerDetalleDeUnUsuarioPorIdExitosamente
  

## Tecnologías utilizadas

* Java
* TestNG
* Rest Assured
* 

## Instalación

Se requiere tener Java y TestNG instalados en el sistema
Se codficó con Java sdk 21
Se requiere generar un token desde https://gorest.co.in/
El token se debe colocar SIN COMILLAS en el archivo src/test/resources/config.properties
Ejemplo:
GOREST_TOKEN=653f988b87dfabb9dcccf393ca573



