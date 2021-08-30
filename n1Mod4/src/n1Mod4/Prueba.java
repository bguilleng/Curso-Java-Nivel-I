/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1Mod4;

/**
 *
 * @author USER
 */
public class Prueba {
    public static void main(String [] args)
    {
	int num = 150;
	System.out.println("El número es: " + num);
	int c = cuad(num);
 	System.out.println("El cuadrado es: " + c);
    }
	
    private static int cuad(int num) 
    {
        return num * num;
    }
}
