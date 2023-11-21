import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class GridLayoutExample extends JFrame{
    public GridLayoutExample() {
        super("Janela Principal");
        //add um Jpanel
        JPanel painel = new JPanel();
        this.add(painel);
        //modificar o Layout do Painel(Jpanel) flow->Grid
        GridLayout grid = new GridLayout(2,2);
        painel.setLayout(grid);
        //add dos componentes ao Jpanel
        for (int i = 0; i < 4; i++) {
            painel.add(new JButton(""+i));
        }
        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}

