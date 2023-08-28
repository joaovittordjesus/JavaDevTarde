import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentsContainer extends JFrame {
    private int cont = 0; // Declare 'cont' as an instance variable

    public ComponentsContainer() {
        super("Container Window");
        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        this.add(panel1);

        JButton button1 = new JButton("Click Here");
        JLabel text1 = new JLabel("Click n°");

        panel1.add(button1);
        panel1.add(text1);

        button1.addActionListener(e -> {
            cont++;
            text1.setText("Clicks N° " + cont);
        });

        this.setVisible(true);
    }
}
