/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa4todolistapp;

/**
 *
 * @author joaovittordjesus
 */
public class Task {
    //Attributes
    String description;
    boolean done;
    //Constructor
    public Task(String description){
        this.description = description;
        this.done = false;
    }
    //Getters & Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}