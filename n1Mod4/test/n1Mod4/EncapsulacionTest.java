package n1Mod4;

/** Pruebas sin dependencias externas, compatibles con Java 8. */
public class EncapsulacionTest {
    public static void main(String[] args) {
        Matema objeto = new Matema();
        if (Double.compare(objeto.getNum(), 100.0) != 0) {
            throw new AssertionError("El valor inicial debe ser 100");
        }
        if (objeto.calcularCuadrado(10) != 100) {
            throw new AssertionError("El cuadrado de 10 debe ser 100");
        }
        if (objeto.calcularCuadrado(-4) != 16) {
            throw new AssertionError("El cuadrado de -4 debe ser 16");
        }
        if (objeto.calcularCuadrado(0) != 0) {
            throw new AssertionError("El cuadrado de 0 debe ser 0");
        }
        System.out.println("EncapsulacionTest: OK");
    }
}
