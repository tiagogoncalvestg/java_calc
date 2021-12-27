/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.tg.calculadora.model;

/**
 *
 * @author Tiago
 */

@FunctionalInterface
public interface MemoriaObservador {
    
    void valorAlterado(String novoValor);
    
}
