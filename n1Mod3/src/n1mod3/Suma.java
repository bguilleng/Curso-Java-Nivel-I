/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n1mod3;

/**
 *
 * @author USER
 */
public class Suma
{
	public static void main( String[] args )
	{
		int total = 0; 
		for ( int num = 2; num <= 20; num += 2 )
		{
			total += num;
			total = total + num;
		}
		System.out.printf( "Suma es %d\n", total ); 	
	}
}
