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
public class Interes
{
	public static void main( String[] args )
	{
		double monto; 
		double deposito = 1000.0; 
		double tasa = 0.05; 
		int anio = 1;

		System.out.printf( "%s%20s\n", "Año", "Monto en la cuenta" );
		monto = deposito * Math.pow( 1.0 + tasa, anio );
		System.out.printf( "%4d%,20.2f\n", anio, monto );
	} 
}

