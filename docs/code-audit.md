# Auditoría de código — 2026-10-19

Estado: **parcial**. PR #1 (en borrador), rama `audit/fix-java-greeting-20261019`.

## Corrección inicial conservada

`MiPrimerPgmJava.java` tenía un literal abierto con `@`; el commit inicial de este PR lo corrigió. Fue compilado y ejecutado con JDK 27, con salida verificada exactamente como `Hola papi/mami, soy tu hijo`. **No se modificó nuevamente**.

## Módulo 4: hallazgos y tratamiento

`n1Mod4/src/n1Mod4/Ejemplo.java` accedía a `Matema.num` y `Matema.cuadrado(int)`, ambos privados. Son dos errores de compilación, incluso por tratarse del mismo paquete.

No existe en las fuentes una instrucción explícita que demuestre que el fallo fuese intencional. Dado el valor pedagógico para encapsulación, se ofrecen las dos caras:

1. Código ejecutable corregido: `Matema` conserva `num` y `cuadrado(int)` como privados. Expone `getNum()` de solo lectura y `calcularCuadrado(int)` como operación pública delegada. `Ejemplo` utiliza esos métodos.
2. Fragmentos de acceso inválido conservados **solamente en `n1Mod4/ENCAPSULACION.md`**, claramente etiquetados como ejercicios que no deben compilar en el proyecto.

`n1Mod4/test/n1Mod4/EncapsulacionTest.java` valida valor inicial 100.0 y cuadrados de 10, -4 y 0 sin dependencias de terceros.

## Validaciones efectivamente ejecutadas

- **JDK 27, PR inicial**: `MiPrimerPgmJava` compila con `-Xlint:all` y produce el saludo esperado; la compilación general previa detectó los dos accesos privados y siete advertencias Javadoc.
- **JDK 21 (OpenJDK), nueva corrección**: `javac --release 8 -Xlint:all -encoding UTF-8 -d <directorio> Matema.java Ejemplo.java EncapsulacionTest.java` **terminó correctamente**. `java n1Mod4.Ejemplo` imprimió `100.0` y `100`; `java n1Mod4.EncapsulacionTest` imprimió `EncapsulacionTest: OK`.
- El compilador JDK 21 emitió **tres avisos de opción obsoleta** por `--release 8` (`source`, `target`, `options`), **no** advertencias del código de las tres clases.

## Inventario parcial y pendientes

- **Ejemplo / Matema**: corregidos, compilados y ejecutados con JDK 21 y objetivo de API Java 8.
- **EncapsulacionTest**: prueba automática aprobada en ese entorno.
- **Prueba / SumaDeVal / metodos**: código inspeccionado; comportamiento de ejecución y validación integral del módulo pendientes.
- **Arrays / Recursividad / messages / GraphIntro / prueba / pruebaxyz**: validación integral e interacciones pendientes.
- **Acceso directo a privados**: ejercicio didáctico deliberadamente inválido, fuera de las fuentes compilables.

### Aún no verificado

- Compilación y ejecución con **JDK 8 real**; `--release 8` en JDK 21 comprueba sintaxis, nivel de bytecode y APIs Java 8, pero no sustituye una ejecución real bajo JRE 8.
- Compilación completa NetBeans / Ant, módulos restantes, interfaces Swing o interactivas, y advertencias Javadoc preexistentes.
- CI de GitHub Actions para el nuevo HEAD.

Esta auditoría sigue siendo parcial. Mantener el PR en borrador, sin fusionar automáticamente.
