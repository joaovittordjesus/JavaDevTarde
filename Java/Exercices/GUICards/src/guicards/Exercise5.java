package guicards;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercise5 extends JFrame {
    int points = 0;

    public Exercise5() {
        super("Exercise 5 Game");
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);
        this.add(mainPanel);

        // Card 1
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Início - Pressione Start para começar o jogo"));
        JButton button1 = new JButton("INICIAR");
        card1.add(button1);
        mainPanel.add(card1, "INICIO");

        // Card 2
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem ganhou a copa de 2010?"));
        JTextField field1 = new JTextField();
        card2.add(field1);
        JButton button2 = new JButton("PRÓXIMO");
        card2.add(button2);
        mainPanel.add(card2, "1ª Pergunta");

        // Card 3
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Qual país ganhou a Copa do Mundo de 2010?"));
        JTextField field2 = new JTextField();
        card3.add(field2);
        JButton button3 = new JButton("PRÓXIMO");
        card3.add(button3);
        mainPanel.add(card3, "2ª Pergunta");

        // Card 4 - Pontos
        JPanel card4 = new JPanel();
        card4.add(new JLabel("Resultado Final: " + points + " pontos!"));

        // Configurando o Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 300, 200);
        this.setVisible(true);

        // Tratamento de Eventos
        button1.addActionListener(e -> {
            cardLayout.next(mainPanel);
        });

        button2.addActionListener(e -> {
            if (field1.getText().toUpperCase().equals("ESPANHA")) {
                points++;
            }
            cardLayout.next(mainPanel);
        });

        button3.addActionListener(e -> {
            if (field2.getText().toUpperCase().equals("ESPANHA")) {
                points++;
            }
            cardLayout.next(mainPanel);
            cardLayout.next(mainPanel);
        });
    }

    public static void main(String[] args) {
        Exercise5 game = new Exercise5();
    }
}
