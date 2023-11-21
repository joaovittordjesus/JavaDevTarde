
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//Author João Vittor Domingos de Jesus
//joaovittordjesus
//Exercise 1

public class Exercise1 extends JFrame{
    public Exercise1(){
        super("Exercise 1");
        
        //Creating main panel
        JPanel mainPanel = new JPanel();
        
        //Creating the CardLayout manager
        CardLayout cardlayout = new CardLayout();
        mainPanel.setLayout(cardlayout);
        
        //Creating the cards
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();
        
        //Adding the labels to the card
        card1.add(new JLabel("Card 1"));
        card1.add(new JLabel("Card 2"));
        card1.add(new JLabel("Card 3"));
        
        //Creating main 
        JButton nextButton1 = new JButton("Next");
        JButton nextButton2 = new JButton("Next");
        JButton nextButton3 = new JButton("Next");
        
        card1.add(nextButton1);
        card2.add(nextButton2);
        card3.add(nextButton3);
        
        mainPanel.add(card1);
        mainPanel.add(card2);
        mainPanel.add(card3);
        
        this.add(mainPanel);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 400, 400);
        this.setVisible(true);
        
        //Creating ActionLinstener's to the buttons
        nextButton1.addActionListener(e -> {cardlayout.next(mainPanel);});
        nextButton2.addActionListener(e -> {cardlayout.next(mainPanel);});
        nextButton3.addActionListener(e -> {cardlayout.next(mainPanel);});
    }
}

