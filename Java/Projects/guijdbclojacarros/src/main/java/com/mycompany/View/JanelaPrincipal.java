/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author DevTardeA
 */
public class JanelaPrincipal extends JFrame{
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;
    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        CarrosPainel tab1 = new CarrosPainel();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //métodos para tornar a janela visível
    public void Run(){
    this.setVisible(true);
}
}
