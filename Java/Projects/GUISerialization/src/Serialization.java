/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaovittordjesus ft. Diogo Takemori
 */

import java.io.*;
import java.util.List;

public class Serialization {
    // Método para serializar uma lista de usuários em um arquivo binário
    public static void serialize(String file, List<User> users) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(users);
            System.out.println("Data serialized sucessfully.");
        } catch (IOException e) {
            System.err.println("Data serialization error: " + e.getMessage());
        }
    }

    // Método para desserializar uma lista de usuários a partir de um arquivo binário
    public static List<User> deserialize(String file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (List<User>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Data serialization error: " + e.getMessage());
            return null;
        }
    }
}

