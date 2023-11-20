/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolistsa4;

import javax.swing.SwingUtilities;

/**
 *
 * @author joaovittordjesus
 */
public class ToDoListSA4 {

    public static void main(String[] args) {
        // Cria uma instância da aplicação e a executa
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TodoList().run();
            }
        });
    }
}
