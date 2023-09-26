import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample extends JFrame 
{
    public BorderLayoutExample(){
        super("Window Name");
        //add Jpanel and Define the Layout
        JPanel panel = new JPanel(new BorderLayout());
        this.add(panel);
        //adding components
        panel.add(new JButton("South"),BorderLayout.SOUTH);
        panel.add(new JTextField(25),BorderLayout.NORTH);
        panel.add(new JButton("West"),BorderLayout.WEST);
        panel.add(new JButton("East"),BorderLayout.EAST);
        panel.add(new JButton("Center"),BorderLayout.CENTER);
        //Setting Frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
