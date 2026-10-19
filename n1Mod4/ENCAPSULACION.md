# Modulo 4: encapsulacion y validacion

## Objetivo didactico

`Matema` conserva `num` y `cuadrado(int)` privados. Java prohibe que otra clase acceda directamente a esos miembros, incluso dentro del mismo paquete. `Ejemplo` demuestra una alternativa que compila: `getNum()` (consulta de solo lectura) y `calcularCuadrado(int)` (operacion publica delegada en la implementacion privada). No se introduce un setter ni se vuelve publico el campo.

### Ejercicio intencionalmente incorrecto (fragmento; NO se debe compilar dentro del proyecto)

```java
Matema obj = new Matema();
System.out.println(obj.num);          // Error esperado: num has private access
System.out.println(obj.cuadrado(10));  // Error esperado: cuadrado(int) has private access
```

Actividad: explicar la diferencia entre atributos privados, metodos privados y operaciones publicas; sustituir ambos accesos por los de `Ejemplo`. Conservar el fragmento solo en la documentacion evita romper la compilacion del modulo.

## Ejecucion y pruebas

Con un JDK 8 real (recomendado) o un compilador mas reciente con `--release 8`, desde el repositorio:

```sh
mkdir -p build/mod4-test
javac -source 8 -target 8 -encoding UTF-8 -d build/mod4-test n1Mod4/src/n1Mod4/*.java n1Mod4/test/n1Mod4/EncapsulacionTest.java
java -cp build/mod4-test n1Mod4.Ejemplo
java -cp build/mod4-test n1Mod4.EncapsulacionTest
```

En un JDK 9 o posterior, para verificar las APIs disponibles en Java 8, reemplazar `-source 8 -target 8` por `--release 8`. La salida de `Ejemplo` debe ser dos lineas: `100.0` y `100`. La prueba debe imprimir `EncapsulacionTest: OK` y finalizar con codigo 0. No hacen falta bibliotecas de pruebas.

## Estado de ejercicios

- `n1Mod4.Ejemplo`: corregido, compilacion y ejecucion confirmadas con JDK 21 y `--release 8`.
- `n1Mod4.Matema`: clase auxiliar compilable, sin metodo `main`; se valida mediante `Ejemplo` y `EncapsulacionTest`.
- `n1Mod4.EncapsulacionTest`: comprueba el estado inicial y los cuadrados de 10, -4 y 0; validado con JDK 21 y `--release 8`.
- `n1Mod4.Prueba`, `SumaDeVal` y `metodos`: ejercicios independientes; requieren evaluacion ejecutable de conjunto para confirmar comportamiento y cobertura.
- Acceso directo a `num` o `cuadrado`: **ejercicio deliberadamente incorrecto solamente en este documento**; el estudiante debe explicar/corregir las restricciones de acceso.
- Ejercicios `Arrays`, `Recursividad`, `messages`, `GraphIntro`, `prueba` y `pruebaxyz`: no se declara validada su ejecucion interactiva.

## Pendiente

Ejecutar compilacion y pruebas bajo **JDK 8 real** y NetBeans, probar todos los ejercicios interactivos (incluida Swing cuando corresponda), revisar posibles advertencias Javadoc. El cambio no convierte el PR en apto para fusion automatica.
