/*
 * Ejemplo de encapsulacion: el estado y la implementacion permanecen privados.
 */
package n1Mod4;

/** Clase que protege sus datos y expone operaciones controladas. */
class Matema {
    private double num = 100;

    private int cuadrado(int a) {
        return a * a;
    }

    /** Consulta el valor sin permitir su modificacion directa. */
    public double getNum() {
        return num;
    }

    /** Expone la operacion, no el metodo privado que la implementa. */
    public int calcularCuadrado(int valor) {
        return cuadrado(valor);
    }
}
