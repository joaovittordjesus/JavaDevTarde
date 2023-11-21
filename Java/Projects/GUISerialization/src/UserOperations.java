/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaovittordjesus
 */

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UserOperations {
    private List<User> users;
    private DefaultTableModel tableModel;
    private JTable table;

    public UserOperations(List<User> users, DefaultTableModel tableModel, JTable table) {
        this.users = users;
        this.tableModel = tableModel;
        this.table = table;
    }
    
    public void registerUser(String name, String age){
        int intAge = Integer.parseInt(age);
        User user = new User(name, intAge);
        users.add(user);
        updateTable();
    }
    
    public void updateUser(int selectedLine, String name, String age){
        if (selectedLine != -1){
            int intAge = Integer.parseInt(age);
            User user = new User(name, intAge);
            users.set(selectedLine, user);
            updateTable();
        }
    }
    
    public void eraseUser(int selectedLine){
        if(selectedLine != -1){
            users.remove(selectedLine);
            updateTable();
        }
    }
    
    public void eraseAllUsers(){
        users.clear();
        updateTable();
    }
    
    public void saveUsers(){
        Serialization.serialize("data.txt", users);
    }
    
    private void updateTable(){
        tableModel.setRowCount(0);
        for(User user : users){
            tableModel.addRow(new Object[] {user.getName(), user.getAge()});
        }
    }
}
