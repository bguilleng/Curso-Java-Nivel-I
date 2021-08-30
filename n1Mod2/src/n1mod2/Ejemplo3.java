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
import java.util.Scanner; 
public class Ejemplo3 
{ 
	public static void main(String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Ingrese su nombre: "); 
		String nombre = scanner.nextLine(); 
		System.out.println("Nombre : " + nombre);
 
		System.out.print("Ingrese edad: "); 
		int edad = scanner.nextInt(); 
		System.out.println("Edad : " + edad); 
	} 
} 
