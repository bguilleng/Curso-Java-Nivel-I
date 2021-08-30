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
class MiClase2 
{ 
	public static void main(String[] args) 
	{ 
		Scanner miObj = new Scanner(System.in); 
		System.out.println("Ingrese nombre, edad y salario: "); 
		String nombre = miObj.nextLine(); 
		int edad = miObj.nextInt(); 
		double salario = miObj.nextDouble(); 
		System.out.println("Nombre: " + nombre); 
		System.out.println("Edad: " + edad); 
		System.out.println("Salario: " + salario); 
	} 
} 
