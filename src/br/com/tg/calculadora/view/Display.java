/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tg.calculadora.view;

import br.com.tg.calculadora.model.Memoria;
import br.com.tg.calculadora.model.MemoriaObservador;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Tiago
 */
public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().adicionarObservador(this);

        setBackground(new Color(46, 49, 49));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.white);
        label.setFont(new Font("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 28));

        add(label);

    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }

}
