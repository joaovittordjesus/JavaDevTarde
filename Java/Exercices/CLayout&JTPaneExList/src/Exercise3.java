
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joaovittordjesus
 */
public class Exercise3 extends JFrame {
    //Creating constructor
    public Exercise3(){
        super("Exercise 3 CardLayout");
        //Creating the main panel
        JPanel mainPanel = new JPanel();
        //Creating a CardLayout object to set layouts
        CardLayout cardLayout = new CardLayout();
        //Setting Layoyt manager
        mainPanel.setLayout(cardLayout);
        //Addinf main panel
        this.add(mainPanel);
        //Creatng & adding cards to the main panel
        
        //Card 1
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Welcome Page"));
        JButton button1 = new JButton("Login");
        JButton button2 = new JButton("Signup");
        card1.add(button1);
        card1.add(button2);
        mainPanel.add(card1, "Home");//Adding card1 to the main Panel
        
        //Card 2
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Login Page"));
        JButton button3 = new JButton("Home");
        JButton button4 = new JButton("Signup");
        card2.add(button3);
        card2.add(button4);
        mainPanel.add(card2, "Login");//Adding card1 to the main Panel
        
        //Card 3
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Signup Page"));
        JButton button5 = new JButton("Home");
        JButton button6 = new JButton("Login");
        card3.add(button5);
        card3.add(button6);
        mainPanel.add(card3, "Signup");//Adding card1 to the main Panel
        
        //Setting the frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 250, 250);
        this.setVisible(true);
        
        //Buttons methods
        button1.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button1.getText());//It will navigate to the page where the name is the same as the button in this case: Login
        });
        
        button2.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button2.getText());
        });
        
        button3.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button3.getText());
        });
        
        button4.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button4.getText());
        });
        
        button5.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button5.getText());
        });
        
        button6.addActionListener(e->{
            //Card change
            cardLayout.show(mainPanel,button6.getText());
        });
        
        
        
    }
}
