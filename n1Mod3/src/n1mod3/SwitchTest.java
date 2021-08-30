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
public class SwitchTest {
        public static void main(String[] args) 
        {
            String city = "Caracas";
            String zipCode = null;
            
            switch( city )
            {
                case "Madrid":
                    zipCode = "01754";
                    break;
                case "Caracas":
                    zipCode = "01752";
                    break;
                case "Bogota":
                    zipCode = "01701";
                    break;
            } 
            System.out.println("Zip Code " + city + ": " + zipCode);
        }
}
