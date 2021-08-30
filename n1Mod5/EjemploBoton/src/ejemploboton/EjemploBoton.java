/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploboton;

/**
 *
 * @author giova
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;  
import javax.swing.*;    
public class EjemploBoton 
{  
    EjemploBoton() 
    {  
        JFrame f=new JFrame("Calculadora");  
        JPanel panel=new JPanel();  
        /*panel.setBounds(40,80,200,200);    */
        panel.setBackground(Color.gray);
        final JTextField tf1=new JTextField("Numero 1");  
        final JTextField tf2=new JTextField("Numero 2"); 
        JLabel Result = new JLabel("Resultado");
        tf1.setBounds(50,50, 150,20); 
        tf2.setBounds(50,70, 150,20);
        JButton b=new JButton("Calcular");  
        b.setBounds(50,100,120,30);
        Result.setBounds(50,140,95,30);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        tf1.setAlignmentX(Component.CENTER_ALIGNMENT);
        tf2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Result.setAlignmentX(Component.CENTER_ALIGNMENT);
        tf1.setSize(100,20);
        tf2.setSize(100,20);
        Result.setSize(100,20);
        panel.setSize(390,390);
        panel.setLayout(null);
        /*panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));*/
        f.add(panel);
        panel.add(b);
        panel.add(tf1); 
        panel.add(tf2);  
        panel.add(Result);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
        b.addActionListener(new ActionListener()
        {  
            @Override
            public void actionPerformed(ActionEvent e)
            {  
                try
                {    
                    float num1 = Integer.parseInt(tf1.getText());
                    float num2 = Integer.parseInt(tf2.getText());
                    float Resultado = Calculo(num1, num2);
                    Result.setText(String.valueOf(Resultado));
                }
                catch(NumberFormatException f)
                {
                    JOptionPane.showMessageDialog(null, "Error " + f,"Vuelva a ingresar los valores", JOptionPane.PLAIN_MESSAGE);
                }
            }  
        }); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }  
     
    private float Calculo(float num1, float num2)
    {
        try
        { 
            return num1/num2;
        }
        catch(ArithmeticException f)
        {
            JOptionPane.showMessageDialog(null, "Error " + f,"Vuelva a ingresar los valores", JOptionPane.PLAIN_MESSAGE);
            return 0;
        }
    }
        
    public static void main(String[] args) 
    {  
        EjemploBoton ejemploBoton = new EjemploBoton();  
    }  
}

