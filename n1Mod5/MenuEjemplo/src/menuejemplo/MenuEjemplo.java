/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuejemplo;

/**
 *
 * @author giova
 */
import javax.swing.*;    
import java.awt.event.*;    
public class MenuEjemplo implements ActionListener
{    
    JFrame f;    
    JMenuBar mb;    
    JMenu Archivo,Editar,Ayuda;    
    JMenuItem Cortar,Copiar,Pegar,SeleccionarTodo;    
    JTextArea ta;    
    MenuEjemplo()
    {    
        f=new JFrame();    
        Cortar=new JMenuItem("Cortar"); Copiar=new JMenuItem("Copiar");    
        Pegar=new JMenuItem("Pegar");    
        SeleccionarTodo=new JMenuItem("SeleccionarTodo");    
        Cortar.addActionListener(this); Copiar.addActionListener(this);    
        Pegar.addActionListener(this); SeleccionarTodo.addActionListener(this);    
        mb=new JMenuBar();    
        Archivo=new JMenu("Archivo"); Editar=new JMenu("Editar");    
        Ayuda=new JMenu("Ayuda");     
        Editar.add(Cortar);Editar.add(Copiar);Editar.add(Pegar);Editar.add(SeleccionarTodo);    
        mb.add(Archivo);mb.add(Editar);mb.add(Ayuda);    
        ta=new JTextArea();    
        ta.setBounds(5,5,360,320);    
        f.add(mb);f.add(ta);    
        f.setJMenuBar(mb); f.setLayout(null); f.setSize(400,400); f.setVisible(true);    
    }     
    public void actionPerformed(ActionEvent e) 
    {    
        if(e.getSource()==Cortar)  ta.cut();    
        if(e.getSource()==Pegar)   ta.paste();    
        if(e.getSource()==Copiar)  ta.copy();    
        if(e.getSource()==SeleccionarTodo) ta.selectAll();    
    }     
    public static void main(String[] args) 
    {    
        new MenuEjemplo();    
    }    
}    
