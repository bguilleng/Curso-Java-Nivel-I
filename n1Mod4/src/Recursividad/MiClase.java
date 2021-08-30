/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author USER
 */
public class MiClase {
    public static void main(String[] args) 
    { 
	int resul = suma(5, 10);
	System.out.println(resul); 
    } 
    public static int suma(int inicio, int fin)
    { 
	if (fin > inicio) 
	{ 
            return fin + suma(inicio, fin - 1); 
	} 
	else 
	{ 
            return fin; 
	} 
    }  
}
