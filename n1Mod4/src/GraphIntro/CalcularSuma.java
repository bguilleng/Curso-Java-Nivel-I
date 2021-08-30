/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphIntro;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CalcularSuma {
    public static void main( String[] args )
    {
	String primerNum = JOptionPane.showInputDialog( "Ingrese primer entero" );
	String segundoNum = JOptionPane.showInputDialog( "Ingrese segundo entero" );
	int num1 = Integer.parseInt( primerNum );
	int num2 = Integer.parseInt( segundoNum );
	int suma = num1 + num2;
	JOptionPane.showMessageDialog( null, "La suma es " + suma, "Suma dos enteros", JOptionPane.PLAIN_MESSAGE );
    }
}
