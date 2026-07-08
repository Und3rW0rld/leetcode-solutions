# Excersices

Coleccion de ejercicios de algoritmos en Java (estilo LeetCode), con implementaciones y tests unitarios.

## Requisitos

- Java 25 
- Maven 3.9+

## Estructura

- `src/main/java/com/sacevedo/questions/TwoSum.java`
- `src/main/java/com/sacevedo/questions/TrappingRainWater.java`
- `src/main/java/com/sacevedo/questions/ContainerWithMostWater.java`
- `src/test/java/com/sacevedo/questions/*Test.java`

## Ejecutar tests

```powershell
mvn test
```

## Compilar

```powershell
mvn clean compile
```

## Notas

- Se usa JUnit 5 para pruebas.
- Las clases incluyen un `main` de demostracion, pero la validacion principal esta en los tests.
- En este entorno se usa `IO.println(...)` en los `main` de demostracion.


