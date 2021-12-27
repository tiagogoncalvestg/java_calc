/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tg.calculadora.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Tiago
 */
public class Calculadora extends JFrame{
    
    public Calculadora(){
        
        organizarLayout();
    
        setLocationRelativeTo(null);
       // setSize(232, 322);
        setSize(260, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setVisible(true);
                
    }
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
    }

    private void organizarLayout() {
        
        setLayout(new BorderLayout());
        
        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 68));
        add(display, BorderLayout.NORTH);
        
        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
        
    }
    
}
