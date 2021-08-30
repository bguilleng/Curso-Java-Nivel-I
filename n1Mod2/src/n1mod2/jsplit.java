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
import java.util.*;
import java.lang.*;
public class jsplit 
{		
	public static void main(String[] args) 
	{
		String delimit = ",";
		String str = "Papa y Mama, Hijo e Hija, Todos y Uno";
		String[] Val = str.split(delimit);
		System.out.println("Palabras: " + Arrays.toString(Val));
		System.out.println("Palabras: " + Val[0]);
		System.out.println("Palabras: " + Val[1]);
		System.out.println("Palabras: " + Val[2]);
	}	
}
