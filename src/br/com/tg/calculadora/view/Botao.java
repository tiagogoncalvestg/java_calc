/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tg.calculadora.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author Tiago
 */
public class Botao extends JButton{
    
    public Botao(String label, Color cor){
        setText(label);
        setOpaque(true);
        setBackground(cor);
        setForeground(Color.white);
        setFont(new Font("courier",Font.PLAIN,25));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));    
    }
    
}
