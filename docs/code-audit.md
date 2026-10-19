# Auditoría de código — 2026-10-19

Estado: parcial. SHA base: 80538f64b2028996553ccdd19a9ab3d6ddc592e2.

## Corrección

MiPrimerPgmJava.java abría el literal con @ en lugar de comillas. javac 27 detectó tres errores de sintaxis. Se corrigió el delimitador conservando el saludo.

## Validación ejecutada

- javac -Xlint:all -encoding UTF-8 -d <directorio temporal> MiPrimerPgmJava.java: correcto tras la corrección, sin advertencias.
- java -cp <directorio temporal> MiPrimerPgmJava: salida comprobada exactamente como `Hola papi/mami, soy tu hijo`.
- Compilación con -Xlint:all de las otras fuentes: dos errores por acceso privado a Matema.num y Matema.cuadrado desde n1Mod4/Ejemplo.java, y siete advertencias de comentarios Javadoc sin declaración asociada.

## Pendientes

Confirmar si los errores de acceso privado en el módulo 4 son intencionales para enseñar encapsulación antes de cambiar visibilidad o interfaces. No se ejecutaron las interfaces Swing ni todos los ejemplos interactivos. El análisis realizado es revisión manual y diagnósticos estáticos de javac, no una auditoría de seguridad exhaustiva. Se usó JDK 27; falta validar en JDK 8, declarado en los proyectos NetBeans.

No se marca el repositorio como completamente auditado ni se habilita integración automática de esta PR mientras permanezca la validación global pendiente.
