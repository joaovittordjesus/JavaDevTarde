/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolistsa4;

/**
 *
 * @author joaov
 */
public class Task {
    // Atributos
    private String description;
    private boolean done;

    // Construtor
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    // Getters e Setters
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

