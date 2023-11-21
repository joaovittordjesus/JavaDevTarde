package com.mycompany.View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);
        CarrosPainel tab1 = new CarrosPainel();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Run() {
        this.setVisible(true);
    }
}
