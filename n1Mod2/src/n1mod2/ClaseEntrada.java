/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1mod2;

/**
 *
 * @author USER
 */
import java.util.Scanner; // Importar la clase Scanner 
class ClaseEntrada 
{ 
	public static void main(String[] args) 
	{ 
		Scanner myObj = new Scanner(System.in); // Crear un objeto Scanner
		System.out.println("Ingrese nombre de usuario: "); 
		String nombre = myObj.nextLine(); // Leer la entrada del usuario
		System.out.println("El nomnbe de usuario es: " + nombre); // Salida del usuario
	} 
} 
