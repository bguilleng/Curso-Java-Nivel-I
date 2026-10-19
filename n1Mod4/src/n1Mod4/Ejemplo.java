package n1Mod4;

/** Ejemplo compilable de acceso a miembros encapsulados. */
public class Ejemplo {
    public static void main(String[] args) {
        Matema obj = new Matema();
        System.out.println(obj.getNum());
        System.out.println(obj.calcularCuadrado(10));
    }
}
