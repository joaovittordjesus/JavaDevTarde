
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaovittordjesus
 */
public class UsersRegistration extends JFrame {
    private JTextField nameInput;
    private JTextField ageInput;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<User> users = new ArrayList<>();
    private int selectedLine = -1;
    
    //Constructor
    public UsersRegistration(){
        //Setting Frame
        setTitle("User Registration");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Setting table model
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        //Creating table
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        //Data input and buttons
        nameInput = new JTextField(20);
        ageInput = new JTextField(20);
        JButton registerButton = new JButton("Register");
        JButton refreshButton = new JButton("Refresh");
        JButton eraseButton = new JButton("Erase");
        JButton eraseAllButton = new JButton("Erase All");
        JButton saveButton = new JButton("Save");
        //Building the frame
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name: "));
        inputPanel.add(nameInput);
        inputPanel.add(new JLabel("Age: "));
        inputPanel.add(registerButton);
        inputPanel.add(refreshButton);
        inputPanel.add(eraseButton);
        inputPanel.add(eraseAllButton);
        inputPanel.add(saveButton);
        //Adding the layout into the frame;
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        
        File file = new File("data.txt");
        if (file.exists()){
            users = Serialization.deserialize("data.txt");
            updateTable();
        }
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt){
                selectedLine = table.rowAtPoint(evt.getPoint());
                if (selectedLine != -1){
                    nameInput.setText((String) table.getValueAt(selectedLine, 0));
                    ageInput.setText(table.getValueAt(selectedLine, 1).toString());
                    
                }
            }
        });
        
        UserOperations operations = new UserOperations(users, tableModel, table);
        
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations.registerUser(nameInput.getText(), ageInput.getText());
                nameInput.setText("");
                ageInput.setText("");
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations.updateUser(selectedLine, nameInput.getText(), ageInput.getText());
            }
        });

        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations.eraseUser(selectedLine);
            }
        });
    
    eraseAllButton.addActionListener(new ActionListener(){ 
        @Override
        public void actionPerformed(ActionEvent e){
            operations.eraseAllUsers();
        }
    });
    
    saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operations.saveUsers();
            }
        });
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (User user : users) {
            tableModel.addRow(new Object[]{user.getName(), user.getAge()});
        }
    }
}
