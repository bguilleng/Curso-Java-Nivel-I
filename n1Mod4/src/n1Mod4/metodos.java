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
public class metodos {
    static int pMetodo(int x, int y) 
    {	
        return x + y; 	
    } 

    static double pMetodo(double x, double y) 
    { 	
        return x + y; 	
    } 

    public static void main(String[] args) 
    { 
        int myNum1 = pMetodo(8, 5); 

	double myNum2 = pMetodo(4.3, 6.26);
	System.out.println("int: " + myNum1); 
	System.out.println("double: " + myNum2); 
    }    
}
