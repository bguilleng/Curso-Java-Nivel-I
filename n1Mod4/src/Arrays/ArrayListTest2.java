/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ArrayListTest2 {
    public static void main(String[] args) 
    { 
        ArrayList<String> carro = new ArrayList<String>();
        carro.add("Volvo"); 
        carro.add("BMW"); 
        carro.add("Ford"); 
        carro.add("Mazda"); 

        for (int i = 0; i  <   carro.size()   ; i++) 
        { 
             System.out.println(   carro.get(i)   ); 
        } 
    } 
}
