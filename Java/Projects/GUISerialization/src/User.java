import java.io.Serializable;
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author @github joaovittordjesus
 */

public class User implements Serializable{
    //Atributtes
    private String name;
    private int age;
    //Constructor
    public User(String name, int idade){
    this.name = name;
    this.age = age;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
