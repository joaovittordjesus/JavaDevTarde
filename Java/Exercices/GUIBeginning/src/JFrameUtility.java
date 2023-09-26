import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameUtility extends JFrame {
    public JFrameUtility() {
        super("Main Window");
        //Setting the window
        this.setBounds(500, 500, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Adjusting layout
        FlowLayout flow = new FlowLayout(ERROR, ALLBITS, ABORT);
        this.setLayout(flow);
        //add-ins components
        for (int i = 0; i < 6; i++) {
            this.add(new JButton(""+i));
        }
        this.add(new JTextField("My texts",15));
        this.setVisible(true);
    }
    
}
