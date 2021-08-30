/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchcaptura;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author giova
 */
public class TryCatchCaptura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException 
    {  
        Scanner myObj = new Scanner(System.in); // Crear un objeto Scanner
        String datos = null;
        String[] val = null;
        while (datos == null)
        {
            System.out.println("Ingrese dos numeros enteros separados por coma: ");
            datos = myObj.nextLine();
            val = datos.split(",");
            if (val.length == 2)
            {
                try  
                {
                    int num = Integer.parseInt(val[0]);
                    break;
                } 
                catch(NumberFormatException e)  
                {  
                    System.out.println("Ingrese solo numeros enteros separados por coma");               
                    datos = myObj.nextLine();
                    datos = null;
                    System.out.print('\f');
                } 
            }
            else
            {
                System.out.println("Solo puede introducir dos numeros separados por coma");
                datos = myObj.nextLine();
                datos = null;
                System.out.print('\f');
            } 
        }
	 
	int[] Numero = new int[val.length];;

        try  
        {  
            for(int i = 0; i < val.length; i++)
            {
                Numero[i] = Integer.valueOf(val[i]);
            }  
            int data=Numero[0]/Numero[1]; 
            System.out.println("Resultado: " + data);
            System.out.println("Presione Enter");
            datos = myObj.nextLine();
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("Error detectado: " + e);  
        }  
        
        finally
        {
            System.out.println("Siempre se ejecuta");
        }
        System.out.println("Resto del Código");  
    }  
}
