/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author USER
 */
public class ArraysJava {
    public static void main(String[] args)
    {
        double[] d = new double[8];
        d[2] = 10.25;
        d[5] = 15.35;
        metodo(d);
        System.out.println(d[2]);
        System.out.println(d[5]);
    }
    static void metodo(double[] d)
    {
        d[2] = 25.32; 
        d[5] = 45.89; 
    }
}
