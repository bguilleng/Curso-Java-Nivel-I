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
public class SumaDeVal {
    static int sumar(int...vals) 
    {
        int suma = 0;
        for (int val : vals) 
        { 
            suma += val; 
        }
        return suma;
    }

    public static void main(String[] args) 
    {
        int s3 = sumar(1, 2, 3, 4, 5, 6, 7);
        System.out.println(s3);
    }
}
